package ch16.sec05;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//�޼ҵ� ����
		person.action((x,y) -> Computer.staticMethod(x,y));
		person.action(Computer::staticMethod);  //--------------------static �޼ҵ� ����
		
		Computer com =  new Computer();// ---------------------------instance �޼ҵ� ����
		person.action(com::instanceMethod);
		
	}

}
