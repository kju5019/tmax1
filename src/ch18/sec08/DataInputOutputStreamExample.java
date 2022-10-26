package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		//DataOutputStream ����
		FileOutputStream fos = new FileOutputStream("c:/temp/db");
		//������Ʈ�� new ������Ʈ�� (�⺻��Ʈ��);
		DataOutputStream dos = new DataOutputStream(fos); 
		
		//�⺻Ÿ�� ���
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.flush(); dos.close(); fos.close();  //������� �������� �ݴ°� �Ϲ���
		
		
		//DataInputStream ����
		FileInputStream fis = new FileInputStream("c:/temp/db");
		DataInputStream dis = new DataInputStream(fis);
		
		String name = dis.readUTF();
		double score = dis.readDouble();
		
		
	}

}
