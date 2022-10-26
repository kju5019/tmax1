package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toString());//날짜정보출력
		System.out.println(date);//날짜정보출력
		System.out.println(new Date());//날짜정보출력
		System.out.println(new Date().toString());//날짜정보출력
		
		//날짜포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");// (E)요일표시
		String strNow = sdf.format(date);
		System.out.println(strNow);

	}

}
