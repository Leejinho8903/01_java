package com.greedy.section05.logical_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 논리 연산자 */
		/* 논리 값(true or false)를 취급하는 연산자이다. */
		
		/* 1. 논리 연산자 결과 값 확인 */
		System.out.println("true와 true의 논리 and 연산 : " + (true && true));
		System.out.println("true와 false의 논리 and 연산 : " + (true && false));
		System.out.println("false와 true의 논리 and 연산 : " + (false && true));
		System.out.println("false와 false의 논리 and 연산 : " + (false && false));

		System.out.println("true와 true의 논리 or 연산 : " + (true || true));
		System.out.println("true와 false의 논리 or 연산 : " + (true || false));
		System.out.println("false와 true의 논리 or 연산 : " + (false || true));
		System.out.println("false와 false의 논리 or 연산 : " + (false || false));
		
		System.out.println("true의 논리 not 연산 : " + (!true));
		System.out.println("false의 논리 not 연산 : " + (!false));
		
		/* 2. 논리식에 논리 연산자 활용 */
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
		System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
		System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d));
		System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));
		
		System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
		System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
		System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b || c < d));
		System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));
		
		
		
		
		
		
		
		
		
		
	}

}
