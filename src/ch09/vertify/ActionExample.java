package ch09.vertify;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("익명 구현 객체");
			}
		};
		action.work();
	}

}
