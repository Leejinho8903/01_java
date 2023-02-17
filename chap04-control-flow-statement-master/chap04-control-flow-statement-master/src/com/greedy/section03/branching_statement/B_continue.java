package com.greedy.section03.branching_statement;

public class B_continue {
	
	public void testSimpleContinueStatement() {
		
		/* 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력 */
		for(int i = 1; i <= 100; i++) {
			
			/* 4와 5의 공배수가 아닌 경우 아래 출력문을 출력하지 않고 증감식으로 넘어감 */
			if(!(i % 4 == 0 && i % 5 == 0)) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}
	
	public void testSimpleContinueStatement2() {
		
		/* 중첩 반복문 내에서 분기문의 흐름 */
		/* continue는 모든 반복문을 건너 뛰는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 건너 뛴다. */
		
		/* 구구단 출력
		 * 단, 각 단의 수가 짝수인 경우 출력을 생략한다. */
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				
				/* su가 짝수인 경우 해당 회차 반복을 건너 뛰고 증감식으로 이동 */
				if(su % 2 == 0) continue;
				
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		}
		
	}
	
	public void testJumpContinue() {
		
		label:
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				
				/* su가 짝수인 경우 해당 회차 반복을 건너 뛰고 이름이 부여 된 반복문의 증감식으로 이동 */
				if(su % 2 == 0) continue label;
				
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
