package ch20.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// 1. 드라이버 로딩
// 2. connection 연결객체 얻기
// 3. sql문 작성하고 dbms에 전달
// 4. 결과 확인
// 5. 자원해제
public class UserInsertExample2 {

	public static void main(String[] args) {
		// 1. 
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
				
				
				
				//스캐너로 입력받기
				String id = scanner.next();
				String name = scanner.next();
				String pwd = scanner.next();
				int age = scanner.nextInt();
				String email = scanner.next();
								
			// 3. sql문 작성하고 dbms에 전달
				String sql = "insert into users values(?,?,?,?,?)";
				System.out.println(sql);
				
			// 3-2. 쿼리문 전달객체 생성
				PreparedStatement pstmt = conn.prepareStatement(sql);

				//값 세팅
				//3-2-1.
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, pwd);
				pstmt.setInt(4, age);
				pstmt.setString(5, email);
				
			// 3-3. 쿼리문 전달 및 실행		-- insert/update/delete 일 때 executeUpdate()
				//return값은 입력/수정/삭제한 행의 수
				int result = pstmt.executeUpdate();
				if(result>0) System.out.println(result + "행이 입력됨");
				//java프로그램은 auto commit모드
			
				
				
				
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
