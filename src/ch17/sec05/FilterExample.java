package ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");
		list.add("신민철");

		//중복제거
		list.stream().distinct().forEach(t-> System.out.println(t));
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		list.stream()
		.filter(t-> t.startsWith("신"))
		.forEach(t-> System.out.println(t));
		System.out.println();
		
		//중복제거 후 신으로 시작하는 요소 필터링
		list.stream()
		.distinct()
		.filter(t-> t.startsWith("신"))
		.forEach(t-> System.out.println(t));
	}

}
