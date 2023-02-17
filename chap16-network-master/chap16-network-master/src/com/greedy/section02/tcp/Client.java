package com.greedy.section02.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		int port = 8500;
		
		try {
			// Client와 Server가 local에서 같이 테스트 되고 있으므로 server ip도 localhost ip이다.
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			//"192.168.0.22"
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.print("대화 입력 : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) 
						break;
					
					String recieveMessage = br.readLine();
					System.out.println(recieveMessage);
					
				} while(true);
				
				br.close();
				pw.close();
				socket.close();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
