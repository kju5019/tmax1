package ch16.sec01;

public class LamdaExample {

	public static void main(String[] args) {
/*		Calculable calc = new Calculable() {

			@Override
			public void calculate(int x, int y) {								
			}
*///---->
		Calculable calc = (x,y) -> {
			int result = x+y;
			System.out.println(result);
			};
			
		action(calc);
		
		action((x, y)-> System.out.println(x+y));

	}

	public static void action(Calculable calculable) {
		int x=40;
		int y=4;
		calculable.calculate(x, y);
	}
}
