package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toString());//��¥�������
		System.out.println(date);//��¥�������
		System.out.println(new Date());//��¥�������
		System.out.println(new Date().toString());//��¥�������
		
		//��¥����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");// (E)����ǥ��
		String strNow = sdf.format(date);
		System.out.println(strNow);

	}

}
