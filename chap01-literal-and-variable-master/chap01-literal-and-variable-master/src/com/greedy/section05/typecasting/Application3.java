package com.greedy.section05.typecasting;

public class Application3 {

	public static void main(String[] args) {
		
		/* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
		 * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다. 
		 * */
		
		int inum = 100;
		long lnum = 100L;
		
		/* 방법 1. 두 수의 연산 결과를 int형으로 변환 후 int 자료형 변수에 리턴 받는다. */
		int isum = (int) (inum + lnum);
		
		/* 방법 2. long형 값을 int로 강제 형변환 한다. */
		int isum2 = inum + (int) lnum;
		
		/* 방법 3. 결과 값을 long형 자료형으로 받는다. (자동 형변환) */
		long lsum = inum + lnum;
		
		/* 주의! int 미만의 자료형의 연산 처리 결과는 항상 int형이다. */
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		//byte result1 = byteNum1 + byteNum2;
		int result1 = byteNum1 + byteNum2;
		
		//short result2 = shortNum1 + shortNum2;
		int result2 = shortNum1 + shortNum2;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
