package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("Value: "+obj.intValue()); //��ڽ�(Wrapper ->int)
		
		int value = obj; //�ڵ� ��ڽ�
		System.out.println("Value: "+value);
		
		Integer obj2 = Integer.valueOf(value);
		obj2 = value; //�ڵ� �ڽ�
	}

}
