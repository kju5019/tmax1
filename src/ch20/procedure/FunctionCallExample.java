package ch20.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionCallExample {

	public static void main(String[] args) {
		Connection conn=null;
		 try {
			  //1-1.����̹��ε�
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			  //2.���ᰴü �ν��Ͻ� ����
			  String url="jdbc:oracle:thin:@localhost:1521:xe";
			  String user="java";
			  String password="oracle";
			  conn = //factory����(GOF)
			 DriverManager.getConnection(url, user, password);
			  
			//���ν��� ȣ�� �� �ۼ� �� CallableStatement��ü ���
			String sql = "{? = call user_login(?,?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			//�� ����
			int i = 0;
			cstmt.registerOutParameter(++i, Types.INTEGER);
			cstmt.setString(++i, "summer");
			cstmt.setString(++i, "12345");

			
			//����
			cstmt.execute();
			
			//����� ���
			int result = cstmt.getInt(1);
			
			//CallableStatement �ݱ�
			cstmt.close();  
			
			String message="";
			switch(result) {
			case 0: message = "�α��� ����"; break;
			case 1: message = "��й�ȣ�� Ʋ��"; break;
			case 2: message = "���̵� �������� ����"; break;
			default: message= "����";	
			}
			
			System.out.println(message);
						
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }

	}

}
