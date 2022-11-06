package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1-1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. ���ᰴü �ν��Ͻ� ����
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="java";
				String password="oracle";					
				conn = DriverManager.getConnection(url, user, password);
				
				//sql�� �ۼ�
				String sql = "select * from users";
				//sql�� ���� ��ü�� ����
				Statement stmt = conn.createStatement();
				//sql�� �����ϰ� ��� Ȯ��
				ResultSet rs = stmt.executeQuery(sql);
				
				//�������
				while(rs.next()) {
					String id = rs.getString("userid");
					String name = rs.getString("username");
					String pwd = rs.getString("userpassword");
					int age = rs.getInt("userage");
					String email = rs.getString("useremail");
					
					System.out.println(id+", "+name+", "+pwd+", "+age+", "+email);
				}
				
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			
		}

	}

}
