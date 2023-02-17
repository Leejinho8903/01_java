package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		/* Scanner 주의 사항 */
		
		Scanner sc = new Scanner(System.in);
		
		/* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리 값 입력 받을 때
		 * "안녕하세요 반갑습니다" 입력 시 공백을 기준으로 두 개의 토큰 "안녕하세요" "반갑습니다"로 분리가 된다.
		 * next()는 다음 토큰인 "안녕하세요"를 읽었고 nextInt()는 다음 토큰을 정수로 읽어야 하는데 "반갑습니다"
		 * 가 읽혀서 InputMismatchException이 발생한다.
		 * => 공백이 있는 문자열을 입력 받을 경우에는 nextLine()을 사용한다. */
		System.out.print("문자열을 입력해주세요 : ");
		String str1 = sc.next();
		System.out.println("str1 : " + str1);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		
		/* 2. 정수, 실수, 논리 값 입력 후 nextLine()으로 문자열 입력 받을 때
		 * 앞에서 남긴 개행을 nextLine()이 읽고 넘어가서 아무것도 입력하지 않았는데 출력되고 프로그램이 종료된다.
		 * => 미리 nextLine()을 호출해서 버퍼를 비우고 동작시킨다. */
		System.out.print("다시 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("num2 : " + num2);
		
		sc.nextLine();
		
		System.out.println("공백이 있는 문자열을 하나 입력해주세요 : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
