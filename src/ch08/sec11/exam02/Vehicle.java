package ch08.sec11.exam02;

public interface Vehicle {
	void run();

}

class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}}

class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}}
