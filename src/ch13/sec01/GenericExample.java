package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.content = "안녕하세요";
		String str = (String)box1.content; //Object에서 String으로 캐스팅
		System.out.println(str);
		box1.content = 100;
		int intValue = (Integer)box1.content;
		System.out.println(intValue);
		
		//제네릭 적용 후, 타입 체킹
		//<클래스> <int><boolean> -> <Integer><Boolean>
		
		Box box2 = new Box();
		box2.content = 100;
		int value = (Integer)box2.content; //Object에서 Integer으로 캐스팅
		System.out.println(value);
		
		
		Box<String> box3 = new Box<String>(); //컴파일시 String 타입으로 변환
		box3.content = "안녕하세요";
		String str3 = box3.content; 
		System.out.println(str3);
		
		Box<Integer> box4 = new Box<Integer>();
		box4.content = 100;
		int value4 = box4.content; 
		System.out.println(value4);

	}

}
