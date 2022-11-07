package ch12.vertify.no11;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data = "아이디,이름,패스워드";
		StringTokenizer stringtokenizer = new StringTokenizer(data, ",");
		
		while(stringtokenizer.hasMoreTokens()) {
			System.out.println(stringtokenizer.nextToken());
		}				
	}
}
