package ch16.sec05;

@FunctionalInterface
public interface Calcuable {
	double calc(double x, double y);
}

class Computer{
	//static ���
	public static double staticMethod(double x, double y) {
		return x+y;
	}
	//instance ��� (non-static)
	public double instanceMethod(double x, double y) {
		return x*y;
	}
}
