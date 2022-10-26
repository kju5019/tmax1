package ch11.sec04;

import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		//Autoclosable �������̽��� ������ ��ü�� with-resources �������� ��� ����
		try(Scanner scanner = new Scanner(System.in);) {
			String msg = scanner.nextLine();
			System.out.println(msg);
		}catch(Exception e){
			System.out.println(e);
		} //finally�� ������
		

	}

}
