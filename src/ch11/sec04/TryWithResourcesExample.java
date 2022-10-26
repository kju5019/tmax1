package ch11.sec04;

import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		//Autoclosable 인터페이스로 구현된 객체만 with-resources 구문으로 사용 가능
		try(Scanner scanner = new Scanner(System.in);) {
			String msg = scanner.nextLine();
			System.out.println(msg);
		}catch(Exception e){
			System.out.println(e);
		} //finally가 없어짐
		

	}

}
