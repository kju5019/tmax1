package ch17.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");

		//외부 반복자
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		//Stream을 이용한 내부반복처리
		Stream<String> stream = set.stream();
		stream.forEach(name-> System.out.println(name));
	}

}
