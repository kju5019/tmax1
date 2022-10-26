package ch15.sec06;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>(); //-------------후입선출
		
		//동전 넣기 push(객체)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		//동전 꺼내기 pop()
		while(!coinBox.isEmpty()) {
			System.out.println(coinBox.peek()); //제일 위에 있는 객체 보여주기 peek()
			coinBox.pop(); //제일 위에 있는 객체 보여주고 삭제 pop()			
		}
	}

}
