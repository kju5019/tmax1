package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");       // ���� ǥ��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");       // �Ҽ� ù°�ڸ����� ǥ��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###.0");  //��ȭǥ��
		System.out.println(df.format(num));

	}

}
