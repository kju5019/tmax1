package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000);
		
		
		try {
			account.withdraw(5000); //throw�� ����� �޼ҵ带 ȣ���ϴ� �������� �ݵ�� ����ó�� �������
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
