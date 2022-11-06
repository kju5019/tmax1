package ch20.stmt;		//p.910
//https://m.blog.naver.com/gongtong/150135598792

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionExample {

	public static void main(String[] args) {
		// 1. dbms와의 견결객체 열기(singleton)
		Connection conn = null;
		try {
			// 2. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 3. 연결객체 인스턴스 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="java";
			String password="oracle";
			
			conn = DriverManager.getConnection(url, user, password);		//factory 패턴(GOF)
			
			System.out.println("연결 성공");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{conn.close();			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
