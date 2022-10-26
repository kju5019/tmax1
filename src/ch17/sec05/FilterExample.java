package ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("�ſ��");
		list.add("�Ź�ö");

		//�ߺ�����
		list.stream().distinct().forEach(t-> System.out.println(t));
		System.out.println();
		
		//������ �����ϴ� ��Ҹ� ���͸�
		list.stream()
		.filter(t-> t.startsWith("��"))
		.forEach(t-> System.out.println(t));
		System.out.println();
		
		//�ߺ����� �� ������ �����ϴ� ��� ���͸�
		list.stream()
		.distinct()
		.filter(t-> t.startsWith("��"))
		.forEach(t-> System.out.println(t));
	}

}
