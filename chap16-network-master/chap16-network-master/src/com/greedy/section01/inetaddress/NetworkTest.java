package com.greedy.section01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) {
		
		try {
			
			InetAddress localIP = InetAddress.getLocalHost();
			
			System.out.println(localIP.getHostAddress());
			System.out.println(localIP.getHostName());
			
			InetAddress naverIP = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 서버 ip : " + naverIP.getHostAddress());
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 서버 ip 개수 : " + naverIPs.length);
			
			for(InetAddress ip : naverIPs) {
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
