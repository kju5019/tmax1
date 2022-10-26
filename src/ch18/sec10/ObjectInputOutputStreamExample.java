package ch18.sec10;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		//�⺻��Ʈ��
		FileInputStream fis = new FileInputStream("c:/temp/object.dat");
		//new ������Ʈ��(�⺻��Ʈ��)
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//��ü�� ���� ���·� ����
		Member m1 = (Member)ois.readObject();
		//�ڿ� ����
		ois.close(); fis.close();
		//������ü ���
		System.out.println(m1.toString());
	}

}
