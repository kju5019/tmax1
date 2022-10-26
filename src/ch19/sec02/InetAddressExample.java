package ch19.sec02;

import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� ip �ּ�: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com ip�ּ�: "+ remote.getHostAddress());
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
