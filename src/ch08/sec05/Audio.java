package ch08.sec05;
//����� �ƴϰ� ����Ŭ����
public class Audio implements RemoCon {

	private int volume;
	
	@Override
	public void turnOn() {
		
			System.out.println(this.getClass().getSimpleName()+"�� �մϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		
		System.out.println(this.getClass().getSimpleName()+"�� �մϴ�.");

	}

}
