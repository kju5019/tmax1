package practice;

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
				return (float)(kor + eng + math)/3;		�Ҽ� ��°�ڸ����� �ݿø� ��� ����?			
			}
		}
*/			
			
		
		
		//6-7
/*		double getDistance(int x1, int y1) {
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
			}
*/
		
		
		//6-10
/*		���� �� �����ڿ� ���� �������� ���� ���� ���� ��� ���ÿ� ? ( b, e )
				a. . ��� �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�.
				b. . �����ڴ� ��ü�� �����ϱ� ���� ���̴�.						--> ��ü �ʱ�ȭ ����
				c. . Ŭ�������� �����ڰ� �ݵ�� �ϳ� �̻� �־�� �Ѵ�.
				d. . �����ڰ� ���� Ŭ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�.
				e. . �����ڴ� �����ε� �� �� ����.							--> ������ ������ ���� ����
*/
		
		
		
		//6-13
/*		a. long add(int x, int y) { return x+y;} --> ���� Ÿ���� �޶� �ȵ�

		�޼ҵ� �����ε�: �޼ҵ� �̸��� ���� �Ű������� Ÿ��, ����, ������ �޶�� �Ѵ�.
*/
		
		
		//6-16
/*			���� �� ���������� ���� �������� ���� ���� ���� ��� ���ÿ� ? 		( a,  )
				a. . �ڵ� �ʱ�ȭ�ǹǷ� ������ �ʱ�ȭ�� �ʿ����.
				b. . ���������� ����� �޼��尡 ����Ǹ� ���������� �Բ� �Ҹ�ȴ�.
				c. . �ż����� �Ű������� ����� ������ ���������̴�.
				d. . Ŭ���������� �ν��Ͻ��������� �޸� �δ��� ����.
				e. (heap) �� ������ �����Ǹ� ������ �÷��Ϳ� ���� �Ҹ�ȴ�.
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
			System.out.println(str+" �� �����Դϱ�? "+isNumber(str));
			str = "1234o";
			System.out.println(str+" �� �����Դϱ�? "+isNumber(str)); 
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
/*		c. ���� �����ڴ� ������ �޼��庸�� ���� �����θ� ������ �� �ִ�.
		d. ������ �޼��庸�� �� ���� ���� ���ܸ� ������ �� �ִ�.
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
		
//		MathŬ���� ���� �ν��Ͻ� ������ �ϳ��� ���� �ν��Ͻ��� ������ �ʿ䰡 ���� �����̴�.
//		MathŬ������ �� ���� ����� static�޼��常���� �����Ǿ� �ֱ� ������ �ν��Ͻ��� ������ �ʿ䰡 ����.
//		�׷��� �ܺηκ����� ���ʿ��� ������ ���� ���� �������� ���� �����ڸ� private���� �����Ͽ���.
		
		
		
		
		
		
		
		
		
		//7-16
//		e. fe instanceof Ambulance		�θ� �ƴϰ� �������̽��� �ƴ�

		
		
		
		
		//7-19	*******************************
		
		
		
		
		
		
		//7-22	*******************************
		
		
		
		
		
		
		
		//7-25
/*		class Outer {
			class Inner {
				int iv = 100;
			}
		}
		class dd {
			public static void main(String[] args) {
				
				Outer o = new Outer();
				Outer.Inner oi = o.new Inner();
				System.out.println(oi.iv);
				
			}
		}
*/
		
		
		
		//7-28
/*		package practice;

		import java.awt.*;
		import java.awt.event.*;
		class Exercise7_28 {
			public static void main(String[] args) {
				Frame f = new Frame();
				f.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						e.getWindow().setVisible(false);
						e.getWindow().dispose();
						System.exit(0);
					}
				});
				
			}
		}
*/		
		
		
		
		
		
		
		
		
}
}
