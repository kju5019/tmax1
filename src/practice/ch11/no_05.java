package practice.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class no_05 {
	
	class Student implements Comparable{
		String name;
		int ban;
		int no;
		int kor, eng, math;
		
		Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
		
		int getTotal() {
		return kor+eng+math;
		}
		
		float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
		}
		
		public String toString() {
		return name +","+ban +","+no +","+kor +","+eng +","+math
		+","+getTotal() +","+getAverage();
		}

		@Override
		public int compareTo(Student o) {
			return name.compareTo(o.name);
			
		}
		}
	
}
