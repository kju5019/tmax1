package ch08.sec11.exam01;

public class Car {
	//�ʵ�
	Tire tire1 = new HankookTire(); //����� ���ÿ� �ʱ�ȭ
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}

}
