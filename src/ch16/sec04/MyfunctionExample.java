package ch16.sec04;

public class MyfunctionExample {

	public static void main(String[] args) {
		MyfunctionalInter mf = new MyfunctionalInter() {

			@Override
			public void greet(String name) {
				System.out.println(name+"�� �氡��");
				
			}		
		};
		
		mf.greet("ȫ�浿");
		//
		mf = a ->System.out.println(a+"�� �氡��");
	}

}
