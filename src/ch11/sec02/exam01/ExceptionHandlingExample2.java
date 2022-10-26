package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("Thisis java");
		printLength(null);
		System.out.println("프로그램 종료");
	}
	
	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("문자수: "+result);
	}catch(Exception e){
		System.out.println("에러발생");
	}finally {
		System.out.println("마무리");  //해당 메소드 반드시 실행
	}
	}
	
}
