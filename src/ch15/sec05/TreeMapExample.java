package ch15.sec05; //p.670

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		//엔트리 저장
		treeMap.put("apple",10); //auto-boxing
		treeMap.put("forever",60);
		treeMap.put("description",40);
		treeMap.put("ever",50);
		treeMap.put("zoo",80);
		treeMap.put("base",20);
		treeMap.put("guess",70);
		treeMap.put("cherry",30); //Ctrl+Alt+화살표 -----복사
		
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();        //---------------------자동 오름차순
		for(Entry<String,Integer> entry : entrySet){
			System.out.println(entry.getKey()+ "-"+ entry.getValue());
		}System.out.println("------------------");
		
		NavigableMap<String,Integer> descendingMap = treeMap.descendingMap(); //------------------내림차순
		Set<Entry<String,Integer>> descendingEntrySet = descendingMap.entrySet();
		for(Entry<String,Integer> e : descendingEntrySet){
			System.out.println(e.getKey()+ "-"+ e.getValue());
		}System.out.println("------------------");
		
		

	}

}
