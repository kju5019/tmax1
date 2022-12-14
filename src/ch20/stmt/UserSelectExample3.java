package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserSelectExample3 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1-1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 연결객체 인스턴스 생성
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="java";
				String password="oracle";					
				conn = DriverManager.getConnection(url, user, password);
				
				//sql문 작성
				String sql = "select * from users where userid = 'hong' ";
				//sql문 전달 객체를 생성
				Statement stmt = conn.createStatement();
				//sql문 실행하고 결과 확인
				ResultSet rs = stmt.executeQuery(sql);
				
				//결과보기
				while(rs.next()) {
					//index 번호로 접근 (1부터 시작하도록
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
