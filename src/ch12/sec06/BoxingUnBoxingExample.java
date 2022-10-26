package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("Value: "+obj.intValue()); //¾ð¹Ú½Ì(Wrapper ->int)
		
		int value = obj; //ÀÚµ¿ ¾ð¹Ú½Ì
		System.out.println("Value: "+value);
		
		Integer obj2 = Integer.valueOf(value);
		obj2 = value; //ÀÚµ¿ ¹Ú½Ì
	}

}
