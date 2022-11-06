package ch20.boards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDeleteExample {
	public static void main(String[] args) {
		Connection conn=null;
	try {
		//1. jdbc����̹� �޸� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		//2. connection ���ᰴü ���
		conn=DriverManager.getConnection(url, "java", "oracle");
		String sql="Delete from boards where bno=?";
		//3. ���� ���ް�ü ����
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//4. ���� ���ް�ü�� binding���� �� ����
		pstmt.setInt(1, 3 );
		
		//5. ������ ���� �� ��� �ޱ�
		//insert/update/delete -> executeUpdate()
		int row =pstmt.executeUpdate();
		System.out.println("������ �� ��: "+row);
		
		pstmt.close();
		
	} catch (Exception e) {
		
	}finally {
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {}
		}
	 }
   }
}