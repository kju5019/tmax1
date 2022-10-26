package ch16.sec04;

public class MyfunctionExample {

	public static void main(String[] args) {
		MyfunctionalInter mf = new MyfunctionalInter() {

			@Override
			public void greet(String name) {
				System.out.println(name+"´Ô ¹æ°¡¿ä");
				
			}		
		};
		
		mf.greet("È«±æµ¿");
		//
		mf = a ->System.out.println(a+"´Ô ¹æ°¡¿©");
	}

}
