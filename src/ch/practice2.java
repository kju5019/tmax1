package ch;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int student=0;
		int score[] =null;
		int sum = 0;
		int max = 0;
						
		while(run) {
		System.out.println("-----------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-----------------------------------------------");
		System.out.print("선택> ");
		
		String str = scanner.nextLine();
		
		switch(str) {
		
		case "1": System.out.print("학생수> ");
		String str1 = scanner.nextLine();
		student = Integer.parseInt(str1);
		score = new int[student];
			break;
		
		case "2": System.out.println("점수입력> ");
			for(int i=0;i<student;i++) {
			System.out.print("score["+i+"]> ");
			score[i] = Integer.parseInt(scanner.nextLine());
			}break;

		case "3": System.out.println("점수리스트> ");
			for(int i=0;i<student;i++) {
			System.out.println("score["+i+"]> "+score[i]);			
			}break; 

		case "4": System.out.println("분석> ");
			for(int i=0;i<student;i++) {
				sum += score[i];
				if(max<=score[i]) {max = score[i];}
			}
			System.out.println("최고 점수: "+max);
			System.out.printf("평균 점수: %5.2f\n",(double)sum/student);
			break;
	
		case "5": System.out.println("프로그램 종료");
			run =!run;								

		}	//switch 종료		

		}  //while 종료

	}

}
