package ch20.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class TransactionExample {

	public static void main(String[] args) {
		Connection conn=null;
		 try {
			  //1-1.����̹��ε�
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			  //2.���ᰴü �ν��Ͻ� ����
			  String url="jdbc:oracle:thin:@localhost:1521:xe";
			  String user="java";
			  String password="oracle";
			  conn = DriverManager.getConnection(url, user, password);
			  //���� Ŀ�� ���
			  conn.setAutoCommit(false); 
			  
			  //����۾�
			String sql1 = "update accounts set balance = balance-? where ano=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");			
			int rows1 = pstmt1.executeUpdate();
			if(rows1==0) throw new Exception("��ݵ��� ����");
			pstmt1.close();
			
			//�Ա�
			String sql2 = "update accounts set balance = balance+? where ano=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-2222");			
			int rows2 = pstmt2.executeUpdate();
			if(rows2==0) throw new Exception("�Աݵ��� ����");
			pstmt2.close();
			
			System.out.println("������ü ����");
			//Database�� ����ó��
			conn.commit();
						
		 }catch(Exception e) {
			 try {
				conn.rollback();
				System.out.println("������ü ����");
				System.out.println(e.getMessage());			 
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
		 }finally {
			 try {
				conn.setAutoCommit(true);		//�������ϱ� �ڵ� Ŀ�Ը��� �ٽ� ��ȯ
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		 }

	}

}
