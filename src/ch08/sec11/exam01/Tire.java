package ch08.sec11.exam01;

public interface Tire {
	
	void roll(); //�߻�޼ҵ�
}

class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println(this.getClass().getSimpleName()+" Ÿ�̾ �������ϴ�. ");		
	}	
}

class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println(this.getClass().getSimpleName()+" Ÿ�̾ �������ϴ�. ");		
	}	
}
