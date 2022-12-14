package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

// 1. 드라이버 로딩
// 2. connection 연결객체 얻기
// 3. sql문 작성하고 dbms에 전달
// 4. 결과 확인
// 5. 자원해제
public class UserInsertExample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 
		Connection conn = null;
		
		try {
			//1-1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 연결객체 인스턴스 생성
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
				
			// 3. sql문 작성하고 dbms에 전달
				String sql = new StringBuilder().append("insert into users(userid,username,userpassword,userage,useremail)")
												.append(" values('"+id+"','"+name+"','"+pwd+"',"+age+",'"+email+"')").toString();
				System.out.println(sql);
				
			// 3-2. 쿼리문 전달객체 생성
				Statement stmt = conn.createStatement();
			// 3-3. 쿼리문 전달 및 실행		-- insert/update/delete 일 때 executeUpdate()
				//return값은 입력/수정/삭제한 행의 수
				int result = stmt.executeUpdate(sql);
				if(result>0) System.out.println(result + "행이 입력됨");
				//java프로그램은 auto commit모드
								
			//입력결과 조회
				conn = DriverManager.getConnection(url, user, password);
				
				sql = "select * from users";
				//sql문 전달 객체를 생성
				stmt = conn.createStatement();
				//sql문 실행하고 결과 확인
				ResultSet rs = stmt.executeQuery(sql);
				
				//결과보기
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
