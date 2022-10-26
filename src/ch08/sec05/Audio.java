package ch08.sec05;
//상속은 아니고 구현클래스
public class Audio implements RemoCon {

	private int volume;
	
	@Override
	public void turnOn() {
		
			System.out.println(this.getClass().getSimpleName()+"를 켭니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		
		System.out.println(this.getClass().getSimpleName()+"를 켭니다.");

	}

}
