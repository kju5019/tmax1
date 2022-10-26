package ch12.sec11;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		
		Class clazz = Car.class;	                            //Ŭ���� �����κ��� ���
		System.out.println("��Ű��: "+clazz.getPackageName());
		System.out.println("Ŭ���� �̸�: "+clazz.getSimpleName());
		System.out.println("Ŭ���� ��� �� �̸�: "+clazz.getName());
		
		System.out.println("-----------------------------");
				
		Class clazz2 = Class.forName("ch12.sec11.Car");     //���ڿ��κ��� ���*******************		
		System.out.println("��Ű��: "+clazz2.getPackageName());
		System.out.println("Ŭ���� �̸�: "+clazz2.getSimpleName());
		System.out.println("Ŭ���� ��� �� �̸�: "+clazz2.getName());
		
		System.out.println("-----------------------------");
		
		//CarŬ������ �ν��Ͻ� ����
		Car car = new Car();
		Class clazz3 = car.getClass();                           //�ν��Ͻ� ������������ �������
		System.out.println("��Ű��: "+clazz3.getPackageName());
		System.out.println("Ŭ���� �̸�: "+clazz3.getSimpleName());
		System.out.println("Ŭ���� ��� �� �̸�: "+clazz3.getName());
		
	}

}
