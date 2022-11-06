package ch20.oracle.boards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.boards.Board;

public class BoardExample4 {
	Scanner scanner = new Scanner(System.in);
	Connection conn=null;
	public static void main(String[] args) {
	  BoardExample4 boardExample = new BoardExample4();
	  boardExample.list();
	}

public void list() {
System.out.println();
System.out.println("[�Խù� ���]");
System.out.println("----------------------------------------------------------");
System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
System.out.println("----------------------------------------------------------");
//
try {
     conn=getConnection();
	//3. sql���ۼ� dbms�� ����
	  String sql="select bno, bwriter,bdate,btitle from "
	  		   + " boards order by bno desc";

	//3-2. ������ ���ް�ü ����
	 PreparedStatement pstmt = conn.prepareStatement(sql);
   
	//3-3. ������ ���� �� ���� 
	 ResultSet rs =pstmt.executeQuery();
	 while(rs.next()) {
	   Board board = new Board();
	   board.setBno(rs.getInt("bno"));
	   board.setBtitle(rs.getString("btitle"));
	   board.setBwriter(rs.getString("bwriter"));
	   board.setBdate(rs.getDate("bdate"));
	
	   System.out.printf("%-6s%-12s%-16s%-40s \n",
			             board.getBno(),
			             board.getBwriter(),
			             board.getBdate(),
			             board.getBtitle());
	 }
   }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }finally {
		 try {
			 conn.close();
		 }catch (Exception e) {
          System.out.println(e.getMessage());
		}
	 }
	 mainMenu();		
 }//list() ��.

public void mainMenu() {
System.out.println();
System.out.println("----------------------------------------------------------");
System.out.println("���� �޴�: 1.Create | 2.Read | 3.Clear | 4.Exit");
System.out.println("----------------------------------------------------------");
System.out.print("�޴� ����: ");
String menuNo =scanner.nextLine(); 
System.out.println();	


switch(menuNo){
case "1" : create(); break;
case "2" : read(); break;
case "3" : clear(); break;
case "4" : exit(); break;
}
	
}



private void exit() {System.exit(0);}
public void clear() {System.out.println("***clear()�޼ҵ� ���� "); list();}
public void read() {
	System.out.println("***read()�޼ҵ� ���� "); 
	System.out.println("[�Խù� �б�]");
	System.out.print("bno> ");
	int bno = Integer.parseInt(scanner.nextLine());
	
	try {
		conn=getConnection();
		String sql="select bno, btitle,bcontent,bwriter,bdate "
		  		   + " from boards where bno=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			   Board board = new Board();
			   board.setBno(rs.getInt("bno"));
			   board.setBtitle(rs.getString("btitle"));
			   board.setBcontent(rs.getString("bcontent"));
			   board.setBwriter(rs.getString("bwriter"));
			   board.setBdate(rs.getDate("bdate"));
			   
			System.out.println("#######################################");
			System.out.println("��ȣ:"+board.getBno());
			System.out.println("����:"+board.getBtitle());
			System.out.println("����:"+board.getBcontent());
			System.out.println("�ۼ���:"+board.getBwriter());
			System.out.println("��¥:"+board.getBdate());
			System.out.println("#######################################");

		System.out.println("--------------------------------------------------------");
		System.out.println("���� �޴�: 1.Update | 2.Delete | 3.List");
		System.out.println("�޴� ����: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		if(menuNo.equals("1")) {
			update(board);
		}else if(menuNo.equals("2")) {
			delete(board);
		}
			
		}
	}catch (Exception e) {		
		e.printStackTrace();
		System.out.println("read ����");
		exit();
	}
	
list();
}

public void update(Board board) {
	System.out.println("[������ �Խù� �Է�]");
	System.out.println("����> ");
	board.setBtitle(scanner.nextLine());
	System.out.println("����> ");
	board.setBcontent(scanner.nextLine());
	System.out.println("�ۼ���> ");
	board.setBwriter(scanner.nextLine());
	
	try {
		conn=getConnection();
	String sql="update boards set btitle=?, bcontent=?, bwriter=? where bno=?";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.setInt(4, board.getBno());
		
		int result =pstmt.executeUpdate();
		System.out.println(result+"���� ������");
		pstmt.close();
	} catch (SQLException e) {		
		e.printStackTrace();
		System.out.println("���� ����");
		exit();
	}
			
	list();	
}
public void delete(Board board) {
	try {
		conn=getConnection();
	String sql="delete from boards where bno=?";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, board.getBno());
		
		int result =pstmt.executeUpdate();
		System.out.println(result+"���� ������");
		pstmt.close();
	} catch (SQLException e) {		
		e.printStackTrace();
		System.out.println("���� ����");
		exit();
	}
}
public void create() {
	System.out.println("***create()�޼ҵ� ���� "); 
	
	Board board = new Board();
	System.out.println("[�� �Խù� �Է�]");
	System.out.println("����> ");
	board.setBtitle(scanner.nextLine());
	System.out.println("����> ");
	board.setBcontent(scanner.nextLine());
	System.out.println("�ۼ���> ");
	board.setBwriter(scanner.nextLine());
	
	try {
		conn=getConnection();
	String sql="insert into boards (bno, btitle, bcontent, bwriter, bdate)"
			+ " values (seq_bno.nextval,?,?,?,sysdate)";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		
		int result =pstmt.executeUpdate();
		System.out.println(result+"���� �Էµ�");
		pstmt.close();
	} catch (SQLException e) {		
		e.printStackTrace();
		System.out.println("create ����");
		exit();
	}
			
	list();
}	//create ��





Connection getConnection() {
	Connection conn = null;
	// 1-1.����̹��ε�
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.���ᰴü �ν��Ͻ� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "java";
		String password = "oracle";
		conn = DriverManager.getConnection(url, user, password);
	} catch (Exception e) {		
		e.printStackTrace();
	}
	return conn;
 }
}