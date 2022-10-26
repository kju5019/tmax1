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
		//flag용 필드
		public boolean work= true;
		public WorkThread(String name) { setName(name);}

		@Override
		public void run() {
			while(true) {
				if(work) { //현재 스레드가 작업중이면 출력
					System.out.println(getName()+": 작업처리");
				}else {
					Thread.yield(); //현재 스레드가 작업중이 아니면 대기열로 이동처리
				}
			}
		
		}
		
		
	}

