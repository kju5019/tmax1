package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //�̱���
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1); //0�� 1��
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));

		System.out.println((now.get(Calendar.AM_PM))==0?"����":"����"); //0�̸� ���� 1�̸� ����
		System.out.println((now.get(Calendar.HOUR))); //12�ð�
		System.out.println((now.get(Calendar.HOUR_OF_DAY))); //24�ð�
		System.out.println((now.get(Calendar.MINUTE)));
		System.out.println((now.get(Calendar.SECOND)));
		
	}

}
