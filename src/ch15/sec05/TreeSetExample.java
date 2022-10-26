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
		System.out.println(scores.lower(95)); //95���� �ٷ� �Ʒ�
		System.out.println(scores.higher(95)); //95���� �ٷ� ��
		System.out.println("------------------");
		
		System.out.println(scores.floor(95)); //95�ų� ������ �װź��� �ٷ� �Ʒ�
		System.out.println(scores.ceiling(95)); //95�ų� ������ �װź��� �ٷ� ��
		System.out.println("------------------");
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, false); //80 ������
		for(Integer s : rangeSet) {
			System.out.print(s+" ");
		}
		System.out.println("\n------------------");
		
		rangeSet = scores.subSet(80, true, 90, false); //80�� ���� 90�� ������
		for(Integer s : rangeSet) {
			System.out.print(s+" ");
		}
		System.out.println("\n------------------");
	}

}
