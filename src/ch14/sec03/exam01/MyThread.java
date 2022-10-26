package ch14.sec03.exam01;

public class MyThread extends Thread {
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("ºñÇÁ");
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
	}
}
}