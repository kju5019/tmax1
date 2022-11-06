package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserSelectExample5 {

	public static void main(String[] args) {
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
				
				System.out.println("��ȸ�� id�� �Է��ϼ���> ");
				String userid = scanner.next();
				//sql�� �ۼ�
				String sql = "select * from users where userid = '"+userid+"' ";
				System.out.println("�ϼ��� sql��: "+sql);
				//sql�� ���� ��ü�� ����
				Statement stmt = conn.createStatement();
				//sql�� �����ϰ� ��� Ȯ��
				ResultSet rs = stmt.executeQuery(sql);
				
				//�������
				while(rs.next()) {
					//index ��ȣ�� ���� (1���� �����ϵ���
					int i=0;
					String id = rs.getString(++i);
					String name = rs.getString(++i);
					String pwd = rs.getString(++i);
					int age = rs.getInt(++i);
					String email = rs.getString(++i);
					
					System.out.println(id+", "+name+", "+pwd+", "+age+", "+email);
				}
				
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			
		}

	}

}
