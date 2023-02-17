package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* Scanner의 nextLine()과 next() 
		 * nextLine() : "공백을 포함한 한 줄"을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환
		 * next() : 공백 문자나 개행 문자 전까지를 읽어서 문자열로 반환 
		 * */
		
		/* 1. Scanner 객체 생성 */
		Scanner sc = new Scanner(System.in);
		
		/* 2. 문자열 입력 */
		/* 2-1. nextLine() */
		System.out.print("인사말을 입력해주세요 : ");
		String greeting1 = sc.nextLine();
		System.out.println(greeting1);
		
		/* 2-2. next() */
		System.out.print("인사말을 입력해주세요 : ");
		String greeting2 = sc.next();
		System.out.println(greeting2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
