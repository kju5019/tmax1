package ch12.sec03;

public class EqualsExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");

		if (m1.equals(m2))
			System.out.println("m1�� m2�� �����մϴ�.");
	else System.out.println("m1�� m2�� �������� �ʽ��ϴ�.");
		
		if (m1.equals(m3))
			System.out.println("m1�� m3�� �����մϴ�.");
	else System.out.println("m1�� m3�� �������� �ʽ��ϴ�.");
	}
}
