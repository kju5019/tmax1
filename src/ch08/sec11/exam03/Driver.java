package ch08.sec11.exam03;

public class Driver {
	void run(Vehicle v) {
		v.run();
		
	//Vehicle로 넘어온 객체가 원래 Bus에서 시작되었는지 확인
	// 참조변수 instanceof 클래스 : 참조변수가 클래스로 변환 가능한가? true/false
	if(v instanceof Bus b) {
		b.checkFare();
		}		
	}
}
