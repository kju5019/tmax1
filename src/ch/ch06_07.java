package ch;

public class ch06_07 {

	public static void main(String[] args) {

		//6-1
/*		class SutdaCard{
			int num;
			boolean isKwang;
		}
*/		
		
		
		//6-4
/*		class Student{
			String name;
			int ban, no, kor, eng, math;
			
			int getTotal(){
				return kor + eng + math;
			}
			float getAverage(){
				return (float)(kor + eng + math)/3;		소수 둘째자리에서 반올림 어떻게 하지?			
			}
		}
*/			
			
		
		
		//6-7
/*		double getDistance(int x1, int y1) {
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
			}
*/
		
		
		//6-10
/*		다음 중 생성자에 대한 설명으로 옳지 않은 것은 모두 고르시오 ? ( b, e )
				a. . 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
				b. . 생성자는 객체를 생성하기 위한 것이다.						--> 객체 초기화 목적
				c. . 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
				d. . 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
				e. . 생성자는 오버로딩 할 수 없다.							--> 여러개 생성자 정의 가능
*/
		
		
		
		//6-13
/*		a. long add(int x, int y) { return x+y;} --> 리턴 타입이 달라서 안됨

		메소드 오버로딩: 메소드 이름은 같되 매개변수의 타입, 개수, 순서가 달라야 한다.
*/
		
		
		//6-16
/*			다음 중 지역변수에 대한 설명으로 옳지 않은 것은 모두 고르시오 ? 		( a,  )
				a. . 자동 초기화되므로 별도의 초기화가 필요없다.
				b. . 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
				c. . 매서드의 매개변수로 선언된 변수도 지역변수이다.
				d. . 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
				e. (heap) 힙 영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
*/
		
		
		//6-19
/*		ABC123
		After change:ABC123
*/
		
		
		//6-22
/*		class Exercise6_22 {
			
			public static boolean isNumber(String str){
				for( int i=0; i<str.length(); i++) {
					char c = str.charAt(i);
					if('0'>c || c>'9') return false;
				}
				return true;
			}
					
			public static void main(String[] args) {
			String str = "123";
			System.out.println(str+" 는 숫자입니까? "+isNumber(str));
			str = "1234o";
			System.out.println(str+" 는 숫자입니까? "+isNumber(str)); 
			}
			}
*/
		
		
		
		
		
		
		
		//7-1
/*		for(int i=0; i< cards.length; i++) {
			int num = i%10 +1;
			boolean inKwang = (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard[num,isKwang];
		}
*/
		
		
		//7-4
/*		c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다
		d. 조상의 메서드보다 더 많은 수의 예외를 선언할
*/
		
		
		//7-7
//		x=200
		
		
		
		//7-10
/*		public boolean isPowerOn() {
			return isPowerOn;
		}
		public void setPowerOn(boolean isPowerOn) {
			this.isPowerOn = isPowerOn;
		}
		public int getChannel() {
			return channel;
		}
		public void setChannel(int channel) {
			this.channel = channel;
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
*/
		
		
		
		
		//7-13 **************************************
		
		
		
		
		
		
		
		
		
		
		
		
		//7-16
//		e. fe instanceof Ambulance

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
