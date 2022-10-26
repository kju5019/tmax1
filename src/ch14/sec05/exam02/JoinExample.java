package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		//스레드 메소드 실행= 스레드.start()
		sumThread.start();
		try {
		sumThread.join();    //스레드 결과를 얻고싶을 때 대기하는 메소드 join()
		}catch(InterruptedException e) {}
		
		System.out.println("1~100합: "+sumThread.getSum());
		

	}

}
