package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		//�ν��Ͻ������ ����� Ŭ������ �ٱ��� Ŭ������ ��ü�� ���� �� new A()
		A a = new A();
		//���� Ŭ������ ��ü�� ���� a.new B()
		A.B b = a.new B();

	}

}
