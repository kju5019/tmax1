package ch14.sec05.exam02;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		workThreadA.work=false;
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		workThreadA.work=true;
		

	}
}

	class WorkThread extends Thread{
		//flag�� �ʵ�
		public boolean work= true;
		public WorkThread(String name) { setName(name);}

		@Override
		public void run() {
			while(true) {
				if(work) { //���� �����尡 �۾����̸� ���
					System.out.println(getName()+": �۾�ó��");
				}else {
					Thread.yield(); //���� �����尡 �۾����� �ƴϸ� ��⿭�� �̵�ó��
				}
			}
		
		}
		
		
	}

