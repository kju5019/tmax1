package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //싱글톤
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1); //0이 1월
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));

		System.out.println((now.get(Calendar.AM_PM))==0?"오전":"오후"); //0이면 오전 1이면 오후
		System.out.println((now.get(Calendar.HOUR))); //12시간
		System.out.println((now.get(Calendar.HOUR_OF_DAY))); //24시간
		System.out.println((now.get(Calendar.MINUTE)));
		System.out.println((now.get(Calendar.SECOND)));
		
	}

}
