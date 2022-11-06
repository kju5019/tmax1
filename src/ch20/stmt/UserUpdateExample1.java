package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

// 1. ����̹� �ε�
// 2. connection ���ᰴü ���
// 3. sql�� �ۼ��ϰ� dbms�� ����
// 4. ��� Ȯ��
// 5. �ڿ�����
public class UserUpdateExample1 {

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
				
				System.out.println("������ id�� �Է� > ");
				String id = scanner.next();
				System.out.println("������ pwd�� �Է� > ");
				String pwd = scanner.next();
				
				
			// 3. sql�� �ۼ��ϰ� dbms�� ����
				String sql = "update users set userpassword = '"+pwd+"' where userid='"+id+"'";
				System.out.println(sql);
				
			// 3-2. ������ ���ް�ü ����
				Statement stmt = conn.createStatement();
			// 3-3. ������ ���� �� ����		-- insert/update/delete �� �� executeUpdate()
				//return���� �Է�/����/������ ���� ��
				int result = stmt.executeUpdate(sql);
				if(result>0) System.out.println(result + "���� ������");
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
