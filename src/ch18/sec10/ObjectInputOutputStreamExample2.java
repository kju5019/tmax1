package ch18.sec10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample2 {

	public static void main(String[] args) throws Exception {
		//기본스트림
		FileOutputStream fos = new FileOutputStream("c:/temp/object.dat");
		//new 보조스트림(기본스트림)
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//객체생성
		Member m1 = new Member("fall","단풍이");
		
		//객체를 직렬화 해서 파일에 저장
		oos.writeObject(m1);
		
		oos.flush(); oos.close(); fos.close();
	}

}
