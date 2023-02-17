package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class A_if {
	
	public void testSimpleIfStatement() {
		
		/* 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
		 * 짝수가 아니면 출력하지 않는 구문을 작성한다.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void testNestedIfStatement() {
		
		/* 중첩 된 if문 실행 흐름 확인
		 * if문 안에 또 다른 조건을 사용하여 if문을 사용할 수 있다.
		 * */
		
		/* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
		 * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다."라고 출력하고
		 * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는다.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
