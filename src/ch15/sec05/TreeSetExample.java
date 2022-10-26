package ch15.sec05;  //p.666

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s: scores) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(95)); //95기준 바로 아래
		System.out.println(scores.higher(95)); //95기준 바로 위
		System.out.println("------------------");
		
		System.out.println(scores.floor(95)); //95거나 없으면 그거보다 바로 아래
		System.out.println(scores.ceiling(95)); //95거나 없으면 그거보다 바로 위
		System.out.println("------------------");
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, false); //80 불포함
		for(Integer s : rangeSet) {
			System.out.print(s+" ");
		}
		System.out.println("\n------------------");
		
		rangeSet = scores.subSet(80, true, 90, false); //80은 포함 90은 불포함
		for(Integer s : rangeSet) {
			System.out.print(s+" ");
		}
		System.out.println("\n------------------");
	}

}
