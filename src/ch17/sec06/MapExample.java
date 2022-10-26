package ch17.sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapExample {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("ȫ�浿",85));
		personList.add(new Person("ȫ�浿",92));
		personList.add(new Person("ȫ�浿",87));

		//Function Ÿ�� �Լ��� �������̽�
		personList.stream()
					.mapToInt(person-> person.getScore())
					.forEach(s->System.out.println(s));					
	}
}

class Person{
	private String name;
	private int score;
	
	public Person(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
}