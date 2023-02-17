package com.greedy.section02.loop_statement;

import java.util.Scanner;

public class D_doWhile {
	
	public void testSimpleDoWhileStatement() {
		
		/* 조건을 false로 두고 실행 되는지 테스트 */
		
//		while(false) {
//			System.out.println("while문");
//		}
		
		do {
			System.out.println("dowhile문");
		} while(false);
		
	}
	
	public void testDoWhileExample() {
		
		/* 키보드로 문자열 입력 받아 반복적으로 출력한다.
		 * 단, exit가 입력 되면 반복문을 종료한다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("입력한 문자 : " + str);
		
			/* 문자열(참조 자료형)은 ==, !=로 값 비교가 불가능하다.
			 * String 클래스에서 제공하는 equals() 메소드를 통해 비교해야 한다. */
		} while(!str.equals("exit"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
