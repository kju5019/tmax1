package ch12.sec03;

public class EqualsExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");

		if (m1.equals(m2))
			System.out.println("m1과 m2는 동등합니다.");
	else System.out.println("m1과 m2는 동등하지 않습니다.");
		
		if (m1.equals(m3))
			System.out.println("m1과 m3는 동등합니다.");
	else System.out.println("m1과 m3는 동등하지 않습니다.");
	}
}
