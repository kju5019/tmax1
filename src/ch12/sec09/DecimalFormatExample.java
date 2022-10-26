package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");       // 정수 표기
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");       // 소수 첫째자리까지 표기
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###.0");  //통화표시
		System.out.println(df.format(num));

	}

}
