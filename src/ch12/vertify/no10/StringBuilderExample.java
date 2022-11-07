package ch12.vertify.no10;

public class StringBuilderExample {
	public static void main(String[] args) {
			StringBuilder stringbuilder = new StringBuilder();	
		
			 String str = "";
			 for(int i=1; i<= 100; i++) {
			 stringbuilder.append(i).toString();
			 str += i;
			 }			
		 System.out.println(str);
	}
}
