package ch08.sec11.exam03;

public class Driver {
	void run(Vehicle v) {
		v.run();
		
	//Vehicle�� �Ѿ�� ��ü�� ���� Bus���� ���۵Ǿ����� Ȯ��
	// �������� instanceof Ŭ���� : ���������� Ŭ������ ��ȯ �����Ѱ�? true/false
	if(v instanceof Bus b) {
		b.checkFare();
		}		
	}
}
