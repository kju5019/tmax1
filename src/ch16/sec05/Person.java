package ch16.sec05;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("���: "+ result);
	}

}
