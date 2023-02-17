package com.greedy.section06.ternary_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 삼항 연산자 */
		/* 조건식 ? 참일 때 사용할 값 : 거짓일 때 사용할 값 
		 * */
		
		int num1 = 10;
		int num2 = -10;
		String result1 = (num1 > 0) ? "양수이다." : "양수가 아니다.";
		String result2 = (num2 > 0) ? "양수이다." : "양수가 아니다.";
		
		System.out.println("num1은 " + result1);
		System.out.println("num2는 " + result2);
		
		/* 삼항 연산자 중첩 사용 - 양수, 0, 음수 판별 */
		int num3 = 5;
		int num4 = 0;
		int num5 = -5;
		
		String result3 = (num3 > 0) ? "양수이다." : (num3 == 0) ? "0이다." : "음수이다.";
		String result4 = (num4 > 0) ? "양수이다." : (num4 == 0) ? "0이다." : "음수이다.";
		String result5 = (num5 > 0) ? "양수이다." : (num5 == 0) ? "0이다." : "음수이다.";
		
		System.out.println("num3은 " + result3);
		System.out.println("num4은 " + result4);
		System.out.println("num5은 " + result5);
		
		
		
		
		
		
		
	}

}
