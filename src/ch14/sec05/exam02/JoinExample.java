package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		//������ �޼ҵ� ����= ������.start()
		sumThread.start();
		try {
		sumThread.join();    //������ ����� ������ �� ����ϴ� �޼ҵ� join()
		}catch(InterruptedException e) {}
		
		System.out.println("1~100��: "+sumThread.getSum());
		

	}

}
