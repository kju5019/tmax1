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
			  //1-1.드라이버로딩
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			  //2.연결객체 인스턴스 생성
			  String url="jdbc:oracle:thin:@localhost:1521:xe";
			  String user="java";
			  String password="oracle";
			  conn = DriverManager.getConnection(url, user, password);
			  //수동 커밋 모드
			  conn.setAutoCommit(false); 
			  
			  //출금작업
			String sql1 = "update accounts set balance = balance-? where ano=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");			
			int rows1 = pstmt1.executeUpdate();
			if(rows1==0) throw new Exception("출금되지 않음");
			pstmt1.close();
			
			//입금
			String sql2 = "update accounts set balance = balance+? where ano=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-2222");			
			int rows2 = pstmt2.executeUpdate();
			if(rows2==0) throw new Exception("입금되지 않음");
			pstmt2.close();
			
			System.out.println("계좌이체 성공");
			//Database에 정상처리
			conn.commit();
						
		 }catch(Exception e) {
			 try {
				conn.rollback();
				System.out.println("계좌이체 실패");
				System.out.println(e.getMessage());			 
			} catch (SQLException e1) {				
				e1.printStackTrace();
			}
		 }finally {
			 try {
				conn.setAutoCommit(true);		//끝났으니까 자동 커밋모드로 다시 변환
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		 }

	}

}
