package day231130;

import java.net.InetAddress;

public class InetAddress_ {

	public static void main(String[] args) {
		
		// -IP : 주소 얻기
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: "+local.getHostAddress());
			System.out.println("내 컴퓨터 IP이름: "+local.getHostName());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote: iaArr) {
				System.out.println("www.naver.com IP주소 : "+remote.getHostAddress());
			}
			
		}catch(Exception e) {
			
		}

	}

}
