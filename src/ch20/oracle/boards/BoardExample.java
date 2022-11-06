package ch20.oracle.boards;

import java.util.Scanner;

public class BoardExample {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	  BoardExample boardExample = new BoardExample();
	  boardExample.list();
	}

public void list() {
System.out.println();
System.out.println("[�Խù� ���]");
System.out.println("----------------------------------------------------------");
System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
System.out.println("----------------------------------------------------------");
System.out.printf("%-6s%-12s%-16s%-40s \n", 
		"1", "winter", "2022.01.27", "�Խ��ǿ� ���� ���� ȯ���մϴ�.");
System.out.printf("%-6s%-12s%-16s%-40s \n", 
		"2", "winter", "2022.01.27", "�� �ܿ��� ���� ����ϴ�.");
mainMenu();		


	}//list() ��.

public void mainMenu() {
System.out.println();
System.out.println("----------------------------------------------------------");
System.out.println("���� �޴�: 1.Create | 2.Read | 3.Clear | 4.Exit");
System.out.println("----------------------------------------------------------");
System.out.print("�޴� ����: ");
String menuNo = scanner.nextLine();
System.out.println();	

switch(menuNo) {
case "1": create(); break;
case "2": read(); break;
case "3": clear(); break;
case "4": exit(); break;
}



}

private void exit() {System.exit(0);}
public void clear() {System.out.println("***clear() �޼ҵ� ���� "); list();}
public void read() {System.out.println("***read() �޼ҵ� ���� "); list();}
public void create() {System.out.println("***create() �޼ҵ� ���� "); list();}


}