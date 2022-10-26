package ch15.vertify.no09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			name = entry.getKey();
			if(entry.getValue()>maxScore) maxScore = entry.getValue();
			totalScore += entry.getValue();
		}
		
		System.out.println("평균 점수: "+(totalScore/map.size()));
		System.out.println("최고 점수: "+maxScore);
		System.out.println("최고 점수 득점자: "+name);
	}

}
