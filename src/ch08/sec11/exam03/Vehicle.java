package ch08.sec11.exam03;

public interface Vehicle {
	void run();

}

class Bus implements Vehicle{

	@Override //�����ǵ� �޼ҵ�
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"�� �޸��ϴ�.");
	}
	//�߰��ȸ޼ҵ� --�θ�Ÿ������ ��ȯ�ϸ� �ȳ��´�
	void checkFare() {
		System.out.println("����ǥ�� �˻��մϴ�.");
	}
	}

class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName()+"�� �޸��ϴ�.");
	}}
