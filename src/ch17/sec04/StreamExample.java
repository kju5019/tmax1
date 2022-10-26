package ch17.sec04;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArray = {"È«±æµ¿","½Å¿ë±Ç","±è¹Ì³ª"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(t-> 	System.out.println(t));
				
			}
}
