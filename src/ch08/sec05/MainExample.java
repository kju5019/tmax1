package ch08.sec05;

public class MainExample {

	public static void main(String[] args) {
		RemoCon rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		
		rc = new TV();
		rc.turnOn();
		rc.setVolume(10);

	}

}
