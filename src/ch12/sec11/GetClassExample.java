package ch12.sec11;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		
		Class clazz = Car.class;	                            //클래스 정보로부터 얻기
		System.out.println("패키지: "+clazz.getPackageName());
		System.out.println("클래스 이름: "+clazz.getSimpleName());
		System.out.println("클래스 경로 및 이름: "+clazz.getName());
		
		System.out.println("-----------------------------");
				
		Class clazz2 = Class.forName("ch12.sec11.Car");     //문자열로부터 얻기*******************		
		System.out.println("패키지: "+clazz2.getPackageName());
		System.out.println("클래스 이름: "+clazz2.getSimpleName());
		System.out.println("클래스 경로 및 이름: "+clazz2.getName());
		
		System.out.println("-----------------------------");
		
		//Car클래스의 인스턴스 정보
		Car car = new Car();
		Class clazz3 = car.getClass();                           //인스턴스 참조변수에서 정보얻기
		System.out.println("패키지: "+clazz3.getPackageName());
		System.out.println("클래스 이름: "+clazz3.getSimpleName());
		System.out.println("클래스 경로 및 이름: "+clazz3.getName());
		
	}

}
