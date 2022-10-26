package ch16.sec05;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//메소드 참조
		person.action((x,y) -> Computer.staticMethod(x,y));
		person.action(Computer::staticMethod);  //--------------------static 메소드 참조
		
		Computer com =  new Computer();// ---------------------------instance 메소드 참조
		person.action(com::instanceMethod);
		
	}

}
