package ch16.sec04;

public class Person {
	public void action(Calculable cacCalcuable) {
		double result = cacCalcuable.calc(10, 4);
		System.out.println(result);
	}
}
