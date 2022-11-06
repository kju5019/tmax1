package ch20.stmt;	//이름 검색해서 포함하는 거 찾기

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserSelectExample7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		try {
			//1-1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 연결객체 인스턴스 생성
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="java";
				String password="oracle";					
				conn = DriverManager.getConnection(url, user, password);
				
				System.out.println("조회할 이름을 입력하세요> ");
				String username = scanner.next();
				//sql문 작성
				String sql = "select * from users where username like '%'||'"+username+"'||'%'"; 	//'%"+username+"%' 도 가능
				System.out.println("완성된 sql문: "+sql);
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
