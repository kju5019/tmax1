package ch06;
//19번
public class Account19 {
	static int MIN_BALANCE = 0;
	static int MAX_BALANCE = 1000000;
	
	private int balance = 0;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
		this.balance = balance;
	}
	
	

}
