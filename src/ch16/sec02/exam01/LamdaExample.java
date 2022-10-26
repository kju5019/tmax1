package ch16.sec02.exam01;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//매개변수 없는 메소드 () ->
		person.action(()->{
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		person.action(() -> 	System.out.println("출근을 합니다."));

	}

}
