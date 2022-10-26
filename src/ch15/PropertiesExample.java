package ch15;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		
		//key와 value가 모두 String인 컬렉션객체
		Properties props = new Properties();
		
		props.load(PropertiesExample.class.getResourceAsStream("database.properties"));

		System.out.println("driver="+props.get("driver"));
		System.out.println("driver="+props.getProperty("driver"));
		System.out.println();
		
		Set<Object> keyset = props.keySet();
		Iterator<Object> itor = keyset.iterator();
		while(itor.hasNext()) {
			String key = itor.next().toString();
			System.out.println(key+"="+props.getProperty(key));
		}
	}

}
