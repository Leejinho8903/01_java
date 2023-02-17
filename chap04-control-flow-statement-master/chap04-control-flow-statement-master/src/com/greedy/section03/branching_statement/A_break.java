package com.greedy.section03.branching_statement;

public class A_break {

	public void testSimpleBreakStatement() {

		/* break문을 이용하여 무한 루프를 활용한 1~100까지의 합계 구하기 */
		int i = 1;
		int sum = 0;
		while(true) {
			sum += i++;
			
			/* 반복문의 조건과 별개로 반복문을 빠져나오기 위한 조건을 다시 작성 */
			if(i > 100) break;
			
		}
		
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
		
		
	}
	
	public void testSimpleBreakStatement2 () {
		
		/* 중첩 반복문 내에서 분기문의 흐름 */
		/* break문은 모든 반복문을 종료하는 것이 아니라 자신에게 가장 인접한 반복문 실행만 멈춘다. */
		
		/* 구구단 출력
		 * 단, 각 단의 수가 5보다 큰 경우는 출력을 생략한다. */
		
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				
				if(su > 5) break;
				
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		}
	}
	
	public void testJumpBreak() {
		
		/* 중첩 반복문 내에서 분기문을 이용하여 한 번에 여러 개의 반복문 중지 시키기 */
		
		label:
		for(;;) {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				if(i == 3) break label;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
