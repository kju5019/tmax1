package ch20.boards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardWithFileInsertExample2 {
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
			  
			//3. sql���ۼ� dbms�� ����
			  String sql="insert into boards values(seq_bno.nextval,?,?,?,sysdate,?,?)";
			  System.out.println(sql);
			//3-2. ������ ���ް�ü ����
			 PreparedStatement pstmt = conn.prepareStatement(sql,new String[]{"bno"});
			 
			 //�� ����
			 //3-2-1.
			   pstmt.setString(1, "�� ���� ��");
			   pstmt.setString(2, "�Թڴ��� ������");
			   pstmt.setString(3, "winter");
			   pstmt.setString(4, "snow.jpg");
			   pstmt.setBlob(5,new FileInputStream("src/ch20/oracle/sec06/snow.jpg"));
			   
			//3-3. ������ ���� �� ���� 
			//-- insert/update/delete �϶� executeUpdate()
			//return���� �Է�/����/������ ���� ��
			  int result =pstmt.executeUpdate();
			  
			  if(result==1) { 
				  System.out.println(result+"���� �Էµ�");
				 ResultSet rs=pstmt.getGeneratedKeys();
				 if(rs.next()) {
					 int bno=rs.getInt(1);
					 System.out.println("����� bno:"+bno);
				 }
			  }  
			  //java���α׷��� auto commit���
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