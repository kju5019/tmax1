package practice.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import practice.ch11.no_05.Student;

class no_05_1 {
	
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(new Student("ȫ�浿",1,1,100,100,100));
	list.add(new Student("���ü�",1,2,90,70,80));
	list.add(new Student("���ڹ�",1,3,80,80,90));
	list.add(new Student("���ڹ�",1,4,70,90,70));
	list.add(new Student("���ڹ�",1,5,60,100,80));
	Collections.sort(list);
	Iterator it = list.iterator();
	while(it.hasNext())
	System.out.println(it.next());
	}
	}