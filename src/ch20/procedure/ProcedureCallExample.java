package ch20.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureCallExample {

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
			String sql = "{call user_create(?,?,?,?,?,?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			//�� ����
			cstmt.setString(1, "summer");
			cstmt.setString(2, "�ѿ���");
			cstmt.setString(3, "12345");
			cstmt.setInt(4, 26);
			cstmt.setString(5, "summer@mycom.com");
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			//����
			cstmt.execute();
			
			//����� ���
			int rows = cstmt.getInt(6);
			System.out.println("����� �� ��: "+rows);
			
			//CallableStatement �ݱ�
			cstmt.close();  
			
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }finally {
			 try {
				 conn.close();
			 }catch (Exception e) {
	            System.out.println(e.getMessage());
			}
		 }

	}

}
