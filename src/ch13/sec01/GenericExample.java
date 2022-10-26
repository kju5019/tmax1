package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.content = "�ȳ��ϼ���";
		String str = (String)box1.content; //Object���� String���� ĳ����
		System.out.println(str);
		box1.content = 100;
		int intValue = (Integer)box1.content;
		System.out.println(intValue);
		
		//���׸� ���� ��, Ÿ�� üŷ
		//<Ŭ����> <int><boolean> -> <Integer><Boolean>
		
		Box box2 = new Box();
		box2.content = 100;
		int value = (Integer)box2.content; //Object���� Integer���� ĳ����
		System.out.println(value);
		
		
		Box<String> box3 = new Box<String>(); //�����Ͻ� String Ÿ������ ��ȯ
		box3.content = "�ȳ��ϼ���";
		String str3 = box3.content; 
		System.out.println(str3);
		
		Box<Integer> box4 = new Box<Integer>();
		box4.content = 100;
		int value4 = box4.content; 
		System.out.println(value4);

	}

}
