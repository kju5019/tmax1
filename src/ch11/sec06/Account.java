package ch11.sec06;

public class Account {
	private long balance;
	
public Account() {}

public Long getBalance() {
	return balance;
}

public void deposit(int money) {
	balance +=money;
}

//���� ���ѱ��
public void withdraw(int money) throws Exception{
	if(balance < money)
		throw new Exception("�ܰ� �����մϴ�."); //���� ���ܹ߻� throw new ���ܰ�ü --�̰� throws�� ���ѱ��.
	balance -=money;
}

}
