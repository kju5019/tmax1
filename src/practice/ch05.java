package practice;

import java.util.Scanner;

public class ch05 {

	public static void main(String[] args) {
		
		
		//5-1
/*		 int[] arr[];
		 int[] arr2 = {1,2,3,};
		 int[] arr3 = new int[5];
		 int[] arr4 = new int[]{1,2,3,4,5};
		 int arr5[5];
		 int[] arr6[] = new int[3][];
*/
		
		
		//5-2
/*		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{ 10, 10, 10},
				{ 20, 20, 20, 20},
				{ 30, 30}
				};
		System.out.println(arr[3].length);
		2
*/
		
		
		//5-3
/*		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i];		
		System.out.println("sum="+sum);
		150
*/
		
		
		//5-4
/*		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
				int total = 0;
				float average = 0;
				int count=0;
				for(int i=0; i<arr.length; i++)
					for( int j=0; j<arr[i].length; j++) {
						total += arr[i][j];
						count++;
						}
				average = (float)total/count;
				System.out.println("total="+total);
				System.out.println("average="+average);
*/
		
		
		//5-5		*****************************************************
/*		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];		
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			(    1    )			
		}		
		
			(    2    )	
		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
*/
		 
		
		
		//5-6
/*		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��: "+money/coinUnit[i]+"��");
			money= money - coinUnit[i]*(money/coinUnit[i]);
		}
*/
		
		
		
		//5-7
/*		int money = 3170;
		System.out.println("money="+money);
		int[] coinUnit = {500, 100, 50, 10 };
		int[] coin = {5, 5, 5, 5};
		for(int i=0;i<coinUnit.length;i++) {
		int coinNum = 0;

		
		coinNum = money / coinUnit[i];						
		if(coin[i] >= coinNum) coin[i] -= coinNum;
		else {coinNum=coin[i];
			coin[i] = 0; 
		}						
		money -= coinNum * coinUnit[i];						

		
		System.out.println(coinUnit[i]+"�� : "+coinNum);
		}
		
		if(money > 0) {
		System.out.println("�Ž������� �����մϴ�.");
		System.exit(0); // . ���α׷��� �����Ѵ�
		}
		System.out.println("= ���� ������ ���� =");
		for(int i=0;i<coinUnit.length;i++) {
		System.out.println(coinUnit[i]+"�� :"+coin[i]); 
		}
*/		 
		 
			
			
			
			
			//5-10
/*			if('a'<= ch && ch <= 'z') 
				result += abcCode[ch-'a'];
			else if ('0'<= ch && ch <= '9')
				result += numCode[ch-'0'];
*/		 
		 
		 
		 
		 
		 
			//5-13
/*			class dd {
				public static void main(String args[]) {
					String[] words = { "television", "computer", "mouse", "phone" };
					Scanner scanner = new Scanner(System.in);
					for (int i = 0; i < words.length; i++) {
						char[] question = words[i].toCharArray(); // String char[] �� �� ��ȯ
						
						for( int j=0; j<question.length; j++) {
						int num = (int)Math.random()*question.length;
						
						char temp = question[j];
						question[j] = question[num];
						question[num] = temp;
						}
						
						System.out.printf("Q%d. %s �� ������ �Է��ϼ���.>", i + 1, new String(question));
						String answer = scanner.nextLine();
			// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
						if (words[i].equals(answer.trim()))
							System.out.printf("�¾ҽ��ϴ�.%n%n");
						else
							System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
					}
				} // main�� ��
			}
*/		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}
