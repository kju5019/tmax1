package practice.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class no_02 {

		public static void main(String[] args) {
			ArrayList list = new ArrayList();
			list.add(3);
			list.add(6);
			list.add(2);
			list.add(2);
			list.add(2);
			list.add(7);
			
			HashSet set = new HashSet(list);	//중복 없이 담김 3, 6, 2, 7
			TreeSet tset = new TreeSet(set);	//오름차순으로 정리 2, 3, 6, 7
			Stack stack = new Stack();
			stack.addAll(tset);					//2, 3, 6, 7을 순서대로 쌓음 LIFO구조이므로 나중에 넣은 객체가 먼저 빠져나감
			while(!stack.empty())				//비어있지 않다면 반복
			System.out.println(stack.pop());	// -> 7, 6, 3, 2
			
	}

}
