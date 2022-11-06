package ch20.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// 1. ����̹� �ε�
// 2. connection ���ᰴü ���
// 3. sql�� �ۼ��ϰ� dbms�� ����
// 4. ��� Ȯ��
// 5. �ڿ�����
public class UserInsertExample2 {

	public static void main(String[] args) {
		// 1. 
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		
		try {
			//1-1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. ���ᰴü �ν��Ͻ� ����
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="java";
				String password="oracle";
						
				conn = DriverManager.getConnection(url, user, password);
				
				
				
				//��ĳ�ʷ� �Է¹ޱ�
				String id = scanner.next();
				String name = scanner.next();
				String pwd = scanner.next();
				int age = scanner.nextInt();
				String email = scanner.next();
								
			// 3. sql�� �ۼ��ϰ� dbms�� ����
				String sql = "insert into users values(?,?,?,?,?)";
				System.out.println(sql);
				
			// 3-2. ������ ���ް�ü ����
				PreparedStatement pstmt = conn.prepareStatement(sql);

				//�� ����
				//3-2-1.
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, pwd);
				pstmt.setInt(4, age);
				pstmt.setString(5, email);
				
			// 3-3. ������ ���� �� ����		-- insert/update/delete �� �� executeUpdate()
				//return���� �Է�/����/������ ���� ��
				int result = pstmt.executeUpdate();
				if(result>0) System.out.println(result + "���� �Էµ�");
				//java���α׷��� auto commit���
			
				
				
				
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
