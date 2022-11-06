package ch12.vertify.no15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class DateTimeExample {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2022, 12,31,0,0,0);		
		long remainDay = start.until(end, ChronoUnit.DAYS);
		
		System.out.println("올해 12월 31일까지는 "+remainDay+"일 남았습니다.");
	}
}
