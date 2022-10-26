package ch11.sec07;

public class Account {
	private long balance;
	
public Account() {}

public Long getBalance() {
	return balance;
}

public void deposit(int money) {
	balance +=money;
}

//예외 떠넘기기
public void withdraw(int money) throws Exception{
	if(balance < money)
		throw new MyException("사용자정의 잔고부족"); //강제 예외발생 throw new 예외객체 --이걸 throws로 떠넘긴다.
	balance -=money;
}

}

