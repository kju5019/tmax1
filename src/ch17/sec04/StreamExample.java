package ch17.sec04;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArray = {"ȫ�浿","�ſ��","��̳�"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(t-> 	System.out.println(t));
				
			}
}
