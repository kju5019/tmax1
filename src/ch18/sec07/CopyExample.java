package ch18.sec07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception {
		//입출력 스트림 생성
		String originalFilePath1 = CopyExample.class
				.getResource("originalFile1.jpg")
				.getPath();
	//	System.out.println(originalFilePath1);
		
		String targetFilePath = "c:/temp/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(originalFilePath1);
		

	}

}
