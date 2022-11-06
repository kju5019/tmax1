package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

// 1. ����̹� �ε�
// 2. connection ���ᰴü ���
// 3. sql�� �ۼ��ϰ� dbms�� ����
// 4. ��� Ȯ��
// 5. �ڿ�����
public class UserInsertExample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 
		Connection conn = null;
		
		try {
			//1-1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. ���ᰴü �ν��Ͻ� ����
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="java";
				String password="oracle";
						
				conn = DriverManager.getConnection(url, user, password);
				
				System.out.println("id, name, pwd, email, age > ");
				String id = scanner.next();
				String name = scanner.next();
				String pwd = scanner.next();
				String email = scanner.next();
				int age = scanner.nextInt();
				
			// 3. sql�� �ۼ��ϰ� dbms�� ����
				String sql = new StringBuilder().append("insert into users(userid,username,userpassword,userage,useremail)")
												.append(" values('"+id+"','"+name+"','"+pwd+"',"+age+",'"+email+"')").toString();
				System.out.println(sql);
				
			// 3-2. ������ ���ް�ü ����
				Statement stmt = conn.createStatement();
			// 3-3. ������ ���� �� ����		-- insert/update/delete �� �� executeUpdate()
				//return���� �Է�/����/������ ���� ��
				int result = stmt.executeUpdate(sql);
				if(result>0) System.out.println(result + "���� �Էµ�");
				//java���α׷��� auto commit���
								
			//�Է°�� ��ȸ
				conn = DriverManager.getConnection(url, user, password);
				
				sql = "select * from users";
				//sql�� ���� ��ü�� ����
				stmt = conn.createStatement();
				//sql�� �����ϰ� ��� Ȯ��
				ResultSet rs = stmt.executeQuery(sql);
				
				//�������
				while(rs.next()) {
					id = rs.getString("userid");
					name = rs.getString("username");
					pwd = rs.getString("userpassword");
					age = rs.getInt("userage");
					email = rs.getString("useremail");
					
					System.out.println(id+", "+name+", "+pwd+", "+age+", "+email);
				}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				conn.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}