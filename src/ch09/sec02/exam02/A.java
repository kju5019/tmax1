package ch09.sec02.exam02;

public class A {
	//���� ��� Ŭ���� A$B
	static class B{}
	
	//�ν��Ͻ� �ʵ尪���� B��ü �ʱ�ȭ
	B field1 = new B();
	static B field2 = new B(); //static �ʵ�
	
	//������
	A(){ B b = new B();}
	
	//�ν��Ͻ� �޼ҵ�
	void method() {B b = new B();}
	static void method2() { B b = new B();}
}
class B{}
