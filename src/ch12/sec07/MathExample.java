package ch12.sec07;

public class MathExample {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);		//올림
		double v2 = Math.floor(5.3);	//버림
		System.out.println(v1);
		System.out.println(v2);

		
		System.out.println(Math.max(3, 7));
		System.out.println(Math.min(3, 7));

		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v5 = temp2/100.0;
		System.out.println(v5);
	}

}
