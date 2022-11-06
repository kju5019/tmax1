package ch20.stmt;		//p.910
//https://m.blog.naver.com/gongtong/150135598792

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionExample {

	public static void main(String[] args) {
		// 1. dbms���� �߰ᰴü ����(singleton)
		Connection conn = null;
		try {
			// 2. jdbc ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 3. ���ᰴü �ν��Ͻ� ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="java";
			String password="oracle";
			
			conn = DriverManager.getConnection(url, user, password);		//factory ����(GOF)
			
			System.out.println("���� ����");
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
