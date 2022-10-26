package ch08.vertify.no5;


public class TV implements Remocon{
	public void powerOn() {System.out.println("TV¸¦ ²°½À´Ï´Ù.");}
	

	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}

}
