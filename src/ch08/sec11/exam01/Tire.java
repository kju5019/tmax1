package ch08.sec11.exam01;

public interface Tire {
	
	void roll(); //추상메소드
}

class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println(this.getClass().getSimpleName()+" 타이어가 굴러갑니다. ");		
	}	
}

class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println(this.getClass().getSimpleName()+" 타이어가 굴러갑니다. ");		
	}	
}
