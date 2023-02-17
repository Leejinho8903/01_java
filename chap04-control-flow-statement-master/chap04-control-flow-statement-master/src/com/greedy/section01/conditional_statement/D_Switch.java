package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class D_Switch {
	
	public void testSimpleSwitchStatement() {
		
		/* 정수 두 개와 연산 기호 문자를 입력 받아 두 숫자의 연산 결과를 출력해보는 간단한 계산기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		
		/* 연산의 결과를 저장할 변수 */
		int result = 0;
		
		switch(op) {
		case '+' :
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			result = first / second;
			break;
		case '%' :
			result = first % second;
			break;
			/* default문은 생략 가능하지만 생략하는 경우 주석으로 생략 이유를 작성해주는 것이 좋다. */
			/* 산술 연산 외의 다른 문자에 대한 처리는 생략하였음 */
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
		
	}
	
	public void testSwitchVendingMachine() {
		
		/* switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
		/* JDK 1.7 이상부터는 switch문을 이용하여 문자열을 비교할 수 있다. 
		 * break를 사용하지 않으면 멈추지 않고 계속 실행 구문을 동작시킨다.
		 * */
		
		System.out.println("========== 음료 자판기 ==========");
		System.out.println("  사이다   콜라  환타  박카스  핫식스  ");
		System.out.println("==============================");
		System.out.print("음료를 선택해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();
		
		/* 원하는 음료에 맞는 가격을 저장할 변수 */
		int price = 0;
		
		switch(selectedDrink) {
		case "사이다" :
		case "콜라" :
			price = 1000;
			break;
		case "환타" :
			price = 1200;
			break;
		case "박카스" :
			price = 1500;
			break;
		case "핫식스" :
			price = 1800;
			break;
		}
		
		System.out.println(selectedDrink + "를 선택하셨습니다.");
		System.out.println(price + "원을 투입해주세요!");
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
