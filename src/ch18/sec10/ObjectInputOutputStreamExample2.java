package ch18.sec10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample2 {

	public static void main(String[] args) throws Exception {
		//�⺻��Ʈ��
		FileOutputStream fos = new FileOutputStream("c:/temp/object.dat");
		//new ������Ʈ��(�⺻��Ʈ��)
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//��ü����
		Member m1 = new Member("fall","��ǳ��");
		
		//��ü�� ����ȭ �ؼ� ���Ͽ� ����
		oos.writeObject(m1);
		
		oos.flush(); oos.close(); fos.close();
	}

}
