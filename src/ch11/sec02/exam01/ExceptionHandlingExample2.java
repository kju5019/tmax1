package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		printLength("Thisis java");
		printLength(null);
		System.out.println("���α׷� ����");
	}
	
	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("���ڼ�: "+result);
	}catch(Exception e){
		System.out.println("�����߻�");
	}finally {
		System.out.println("������");  //�ش� �޼ҵ� �ݵ�� ����
	}
	}
	
}
