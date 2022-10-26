package ch11.sec03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			arr[0]=10; arr[1]=20; arr[2]=30;
			arr[0]= Integer.parseInt("삼");
		}catch(NumberFormatException e){
			System.out.println(e);		
		}catch(IndexOutOfBoundsException e){
			System.out.println(e);			
		}
		finally {
			System.out.println("반드시 실행");
		}

	}

}
