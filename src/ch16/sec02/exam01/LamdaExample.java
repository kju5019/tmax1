package ch16.sec02.exam01;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//�Ű����� ���� �޼ҵ� () ->
		person.action(()->{
			System.out.println("����� �մϴ�.");
			System.out.println("���α׷����� �մϴ�.");
		});
		
		person.action(() -> 	System.out.println("����� �մϴ�."));

	}

}
