package ch13.sec04;

public class GenericExample {
	//���ѵ� ���׸� �޼ҵ�
	public static <T extends Number> boolean compare(T t1, T t2) {  //Number = wrapper Ŭ������ �ֻ��� 
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1==v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10,20); //auto-boxing  int -> Integer
		System.out.println(result1);
	}

}
