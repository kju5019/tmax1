package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,"); //문자열을 특정 기준으로 자르는 패턴. 추가는 |로
		
		for(String token:arr)
			System.out.println(token);
		
		System.out.println("-------------");
		
		StringTokenizer st = new StringTokenizer("홍길동/이수홍/박연수", "/"); //"문자열"을 "패턴"으로 자른다
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
