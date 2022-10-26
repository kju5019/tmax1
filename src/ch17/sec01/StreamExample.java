package ch17.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("ȫ�浿");
		set.add("�ſ��");
		set.add("���ڹ�");

		//�ܺ� �ݺ���
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		//Stream�� �̿��� ���ιݺ�ó��
		Stream<String> stream = set.stream();
		stream.forEach(name-> System.out.println(name));
	}

}
