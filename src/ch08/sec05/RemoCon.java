package ch08.sec05;

public interface RemoCon {
	public static final int MAX_VOLUME = 10; //���
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void setVolume(int volume);

}
