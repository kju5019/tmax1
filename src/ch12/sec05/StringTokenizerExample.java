package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "ȫ�浿&�̼�ȫ,�ڿ���";
		String[] arr = data1.split("&|,"); //���ڿ��� Ư�� �������� �ڸ��� ����. �߰��� |��
		
		for(String token:arr)
			System.out.println(token);
		
		System.out.println("-------------");
		
		StringTokenizer st = new StringTokenizer("ȫ�浿/�̼�ȫ/�ڿ���", "/"); //"���ڿ�"�� "����"���� �ڸ���
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
