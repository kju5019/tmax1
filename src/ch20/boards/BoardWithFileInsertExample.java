package ch20.boards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardWithFileInsertExample {

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
				
				
				
			// 3. sql문 작성하고 dbms에 전달
				String sql = "insert into boards values(seq_bno.nextval,?,?,?,sysdate,?,?)";
				System.out.println(sql);
				
			// 3-2. 쿼리문 전달객체 생성
				PreparedStatement pstmt = conn.prepareStatement(sql);

				//값 세팅
				//3-2-1.
				pstmt.setString(1, "눈 오는 날");
				pstmt.setString(2, "함박눈이 내려요");
				pstmt.setString(3, "winter");
				pstmt.setString(4, "snow.jpg");
				pstmt.setBlob(5, new FileInputStream("src/ch20/oracle/sec06/snow.jpg"));
				
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
