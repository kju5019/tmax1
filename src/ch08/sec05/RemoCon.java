package ch08.sec05;

public interface RemoCon {
	public static final int MAX_VOLUME = 10; //상수
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void setVolume(int volume);

}
