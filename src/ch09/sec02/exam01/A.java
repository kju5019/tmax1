package ch09.sec02.exam01;

public class A {
	//�ν��Ͻ� ��� Ŭ���� A$B
	class B{}
	
	//�ν��Ͻ� �ʵ尪���� B��ü �ʱ�ȭ
	B field = new B();
	
	//������
	A(){ B b = new B();}
	
	//�ν��Ͻ� �޼ҵ�
	void method() {B b = new B();}
}
class B{}
