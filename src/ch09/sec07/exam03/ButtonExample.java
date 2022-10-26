package ch09.sec07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		Button.ClickClass bc = btn.new ClickClass();
		btn.setClickListener(bc);
		btn.click();
		
		btn.setClickListener(btn.new ClickClass());
		btn.click();
	}

}
