package ch08.sec08.vertify;

public class TV implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("TV¸¦ Ä×½À´Ï´Ù.");

	}

	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();

	}

}
