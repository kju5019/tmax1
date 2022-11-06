package practice;

public class ch03_04 {
public static void main(String[] args) {
	

	//3-1
	/*
	 *   System.out.println(1 + x << 33);                           6
		 System.out.println(y >= 5 || x < 0 && x > 2);				true
		 System.out.println(y += 10 - x++);							13
		 System.out.println(x+=2);									5
		 System.out.println( !('A' <= c && c <='Z') );				false
		 System.out.println('C'-c);									2
		 System.out.println('5'-'0');								5
		 System.out.println(c+1);									66
		 System.out.println(++c);									B
		 System.out.println(c++);									B
		 System.out.println(c);										C
	 */
	
	
	//3-2
	/*
	  int numOfApples = 123; 
	  int sizeOfBucket = 10; 
	  int numOfBucket = (numOfApples/sizeOfBucket) + (numOfApples%sizeOfBucket >0 ? 1 : 0);
	  System.out.println(" :"+numOfBucket);
	 */
	
	
	
	//3-3
/*	int num = 10;
	System.out.println(num>=0? (num==0)? "0":"양수":"음수");
*/
	
	
	//3-4
/*	int num = 456;
	System.out.println(num/100*100);
*/
	
	
	//3-5
/*	int num = 777;
	System.out.println(num/10*10+1);
*/
	
	
	//3-6
/*	int num = 81;
	System.out.println((num/10+1)*10-num);
*/
	
	
	//3-7 *****************************
/*	int fahrenheit = 100;
	float celcius = ((float)5/9*(fahrenheit-32));
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);
*/
	
	//3-8
	
/*	byte c = (byte)(a + b);	
	ch = (char)(ch + 2);
	float f = (float)3 / 2;
	long l = (long)3000 * 3000 * 3000;	
	boolean result = (float)d==f2;
*/
	
	
	//3-9 
/*	char ch = 'z';
	boolean b = (('A'<= ch && ch <= 'Z')||('a'<= ch && ch <= 'z')||('0'<= ch && ch <= '9'));
	System.out.println(b);
*/	
	
	
	//3-10
/*	char ch = 'Z';
	char lowerCase = ('A'<= ch && ch <= 'Z') ? (char)(ch+32) : ch;
	System.out.println("ch:"+ch);
	System.out.println("ch to lowerCase:"+lowerCase);
*/	
	
	
	
	
	//4-1
/*	1. 10<x && x<20	
 	2. 
 	3. ch=='x' || ch=='X'
 	4. '0'<= ch && ch <= '9'
 	5. ('A'<= ch && ch <= 'Z')||('a'<= ch && ch <= 'z')
 	6. (year%400 == 0) || (year%4 == 0) || (year%100 != 0)
 	7. !powerOn
 	8. "yes".equals(str)	
*/
	
	
	//4-2
/*	int sum=0;
	
	for(int i=1; i<=20;i++) {
		if(i%2 != 0 && i%3 != 0)
			sum += i;
	}
	System.out.println(sum);
	=73
*/
	
	
	
	//4-3
/*	int sum = 0;
	int sum2 = 0;
	
	for(int i=1; i<=10; i++) {
		sum += i;
		sum2 += sum;		
	}
	System.out.println(sum2);
	=220
*/
	
	
	//4-4
	
	
	
	
	
	//4-5
/*	for(int i=0; i<=10; i++) {
		for(int j=0; j<=i; j++)
		System.out.print("*");
		System.out.println();
		}
*/	
/*	int i=1;
	while(i<=10) {
		int j=1;
		while(j<=i) {
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
	}
*/	
	
	
	
	//4-6
/*	for(int i=1; i<=6; i++) {
		for(int j=1; j<=6; j++) {
			if(i+j==6) System.out.println("i: "+i+" j: "+j);
		}
	}
*/
	
	
	//4-7
/*	int value = (int)(Math.random()*6+1);
	System.out.println("value:"+value);
*/
	
	
	//4-8
/*	for(int x=0; x<=10; x++) {
		for(int y=0; y<=10; y++) {
		if(2*x+4*y==10)	
			System.out.println("x="+x+", y="+y);
	}
	}
*/
	
	
	
	//4-9 ********************
/*	String str = "12345";
	int sum = 0;
	for(int i=0; i < str.length(); i++) {
	sum += str.charAt(i) - '0';
	
	}
	System.out.println("sum="+sum);
*/	
	
	
	
	//4-10
/*	int num = 12345;
	int sum = 0;
	
	while(num > 0) {
		sum += num%10;
		num = num/10;
	}
	System.out.println(sum);
*/
	
	
	
	
	//4-11
/*	int num1 = 1;
	int num2 = 1;
	int num3 = 0; // 세번째 값
	System.out.print(num1+","+num2);
	for (int i = 0 ; i < 8 ; i++ ) {
		num3= num1+num2;
		System.out.print(","+num3);
		
		num1=num2;
		num2=num3;
	}
*/
	
	
	
	//4-12
/*	for(int i=2; i<=9; i++) {
		for(int j=1; j<=3; j++)
			System.out.println(i+"*"+j+"="+i*j);
		System.out.println();
	}
*/	
	
	
	
	//4-13
/*	String value = "12o34";
	char ch = ' ';
	boolean isNumber = true;
	
	for(int i=0; i < value.length() ;i++) {
	ch= value.charAt(i);
	if('0'<= ch && ch <= '9') continue;
	else {isNumber = false; break;}
	}
	if (isNumber) {
	System.out.println(value+" 는 숫자입니다.");
	} else {
	System.out.println(value+" 는 숫자가 아닙니다."); 
	}
*/
	
	
	
	//4-14
/*	int answer = (int)(Math.random()*100)+1;
	int input = 0; 
	int count = 0; 
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	do {
	count++;
	System.out.print("1과 100사이의 값을 입력하세요 : ");
	input = s.nextInt(); 
	if(answer>input) System.out.println("더 큰 수를 입력하세요.");
	else if(answer<input) System.out.println("더 작은 수를 입력하세요.");
	else { System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 "+count+"번입니다.");
			break;}
	} while(true); 
*/
	
	
	
	//4-15 ************************************
/*	int number = 12321;
	int tmp = number;
	int result =0; 
	while(tmp !=0) {
	
	
	
	}
	if(number == result)
	System.out.println( number + "는 회문수입니다.");
	else
	System.out.println( number + "는 회문수가 아닙니다.");
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
