package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample { //날짜 조작

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 a HH시mm분ss초");
		System.out.println(dtf.format(now));
		
		LocalDateTime result1 = now.plusYears(1); //1년뒤
		System.out.println(dtf.format(result1));
		
		LocalDateTime result2 = now.plusMonths(1); //1달 뒤
		System.out.println(dtf.format(result2));
		
		LocalDateTime result3 = now.plusDays(7); //7일 후
		System.out.println(dtf.format(result3));

	}

}
