package ch09.sec07.exam03;

public class Button {
	public static interface ClickListener{
		void onClick();
	}
	class ClickClass implements ClickListener{
		@Override
		public void onClick() {
			System.out.println("Ŭ��");	
		}	
	}
	
	//�ʵ�
	private ClickListener clickListener;

	//�޼ҵ�
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	


}
