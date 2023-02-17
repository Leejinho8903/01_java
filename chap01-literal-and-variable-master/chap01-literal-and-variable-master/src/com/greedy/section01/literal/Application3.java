package com.greedy.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		
		/* 문자열 합치기 테스트 */
		System.out.println("===== 두 개의 문자열 합치기 =====");
		System.out.println(9 + 9);			//18
		System.out.println("9" + 9);		//99
		System.out.println(9 + "9");		//99
		System.out.println("9" + "9");		//99
		
		System.out.println("===== 세 개의 문자열 합치기 =====");
		System.out.println(9 + 9 + "9");	//189
		System.out.println(9 + "9" + 9);	//999
		System.out.println("9" + 9 + 9);	//999
		/* 우선적으로 실행하고 싶은 연산이 있는 경우 소괄호로 묶어준다. */
		System.out.println("9" + (9 + 9));	//918
		
		System.out.println("===== 10과 20의 사칙 연산 결과를 보기 좋게 출력 =====");
		System.out.println("10과 20의 합 : " + (10 + 20));	// 괄호를 묶지 않으면 문자열 합치기로 1020
		System.out.println("10과 20의 차 : " + (10 - 20));	
		// 문자열은 마이너스 연산이 불가능하므로 앞에 생성 된 문자열과 마이너스 연산이 불가하다 (반드시 괄호 사용)
		System.out.println("10과 20의 곱 : " + (10 * 20));	//*,/,%는 +,- 보다 우선순위가 높다.
		System.out.println("10과 20의 나누기 : " + (10 / 20));

	}

}