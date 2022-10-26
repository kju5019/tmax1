package ch15.sec06;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>(); //-------------���Լ���
		
		//���� �ֱ� push(��ü)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		//���� ������ pop()
		while(!coinBox.isEmpty()) {
			System.out.println(coinBox.peek()); //���� ���� �ִ� ��ü �����ֱ� peek()
			coinBox.pop(); //���� ���� �ִ� ��ü �����ְ� ���� pop()			
		}
	}

}
