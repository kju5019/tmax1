package ch19.sec06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJSONExample {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/temp/member.json",Charset.forName("UTF-8")));

		String json = br.readLine();
		br.close();
		
		//new JSONObject(문자열)
		JSONObject root = new JSONObject(json);
		//속성정보 읽기
		System.out.println("id: "+root.getString("id"));
		System.out.println("name: "+root.getString("name"));
		System.out.println("age: "+root.getInt("age"));
		System.out.println("student: "+root.getBoolean("student"));

		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home: "+tel.getString("home"));
		System.out.println("mobile: "+tel.getString("mobile"));
		
		//배열 읽기
		JSONArray skill = root.getJSONArray("skill");
		System.out.println("skill: ");
		for(int i=0; i<skill.length(); i++)
			System.out.println(skill.get(i)+", ");
		
		
	}

}
