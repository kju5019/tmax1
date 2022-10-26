package ch08.sec11.exam03;

public interface Vehicle {
	void run();

}

class Bus implements Vehicle{

	@Override //재정의된 메소드
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}
	//추가된메소드 --부모타입으로 전환하면 안나온다
	void checkFare() {
		System.out.println("승차표를 검사합니다.");
	}
	}

class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}}
