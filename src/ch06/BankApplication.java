package ch06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] account= new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			
			switch(menu) {
			case 1:account1(); break;
			case 2:account2(); break;
			case 3:account3(); break;
			case 4:account4(); break;
			case 5: run=!run;
			}
		}
		System.out.println("프로그램 종료");

	}
	
	private static void account1() { 
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("계좌주: ");
		String name = scanner.nextLine();
		
		System.out.println("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account_1 = new Account(ano, name, balance);
		for(int i=0;i<account.length;i++) {
			if(account[i]==null) {
				account[i]=account_1;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");		
	}
	
	
	private static void account2() { 
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		
		for(int i=0;i<account.length;i++) {
			if(account[i] == null) break;
			else System.out.println(account[i].getAno()+"\t"+account[i].getName()+"\t"+account[i].getBalance());
		}
	}
	
	
	private static void account3() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		
		System.out.println("계좌번호: ");
		String ano1 = scanner.nextLine();
		Account account_2 = findAccount(ano1);
		
		System.out.println("예금액: ");
		int deposit = Integer.parseInt(scanner.nextLine());
		
		if(account_2 == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		account_2.setBalance(account_2.getBalance() + deposit);
		System.out.println("예금이 완료되었습니다.");								
	}
	
	
	private static void account4() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		
		System.out.println("계좌번호: ");
		String ano1 = scanner.nextLine();
		Account account_2 = findAccount(ano1);
		
		System.out.println("출금액: ");
		int withdraw = Integer.parseInt(scanner.nextLine());
		
		if(account_2 == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;}
			
		if(account_2.getBalance() < withdraw) {
			System.out.println("잔고가 부족합니다.");
			return;	
		}
		account_2.setBalance(account_2.getBalance() - withdraw);
		System.out.println("출금이 완료되었습니다.");
		}
	
	
	private static Account findAccount(String ano) {
		Account account_2 = null;
		for(int i=0; i<account.length; i++) {
			if(account[i] !=null) {
			if(account[i].getAno().equals(ano)) {
				account_2 = account[i];
				break;
			}
			}
		}return account_2;
	}
	

}
