package ch16.sec01;

@FunctionalInterface //컴파일러에게 추상메소드가 하나이지 확인하라는 주석역할
public interface Calculable {
	void calculate(int x, int y); //함수적 인터페이스는 추상메소드가 하나여야함
//	void calculate2(int x, int y);

}
