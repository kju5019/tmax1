package ch09.sec02.exam02;

public class A {
	//정적 멤버 클래스 A$B
	static class B{}
	
	//인스턴스 필드값으로 B객체 초기화
	B field1 = new B();
	static B field2 = new B(); //static 필드
	
	//생성자
	A(){ B b = new B();}
	
	//인스턴스 메소드
	void method() {B b = new B();}
	static void method2() { B b = new B();}
}
class B{}
