package ch09.sec02.exam02;

public class AExample {

	public static void main(String[] args) {
		//static 멤버로 선언된 클래스는 
		//클래스명.안쪽클래스로 접근
		A a = new A();
		//안쪽 클래스의 객체를 생성 a.new B()
		A.B b = new A.B();

	}

}
