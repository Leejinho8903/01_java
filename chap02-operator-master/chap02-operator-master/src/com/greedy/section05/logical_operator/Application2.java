package com.greedy.section05.logical_operator;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 논리연산자의 활용 */
		
		/* 1. 1부터 100 사이의 값인지 확인 */
		/* 1 <= 변수 <= 100 --> 변수 >= 1 && 변수 <= 100 */
		int num1 = 101;
		System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100));
		
		/* 2. 영어 대문자인지 확인 */
		char ch1 = 'B';
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 65 && ch1 <= 90));
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
		
		/* 3. 대소문자 상관 없이 영문자 y인지 확인 */
		char ch2 = 'y';
		System.out.println("대소문자 상관 없이 영문자 y인지 확인 : " + (ch2 == 'y' || ch2 == 'Y'));
		
		/* 4. 영문자인지 확인 */
		/* A : 65, Z : 90, a : 97, z : 122 (중간의 91 ~ 96은 영문자가 아님) */
		/* && : 11순위
		 * || : 12순위
		 * && 연산자가 || 연산자보다 우선순위가 높다. 
		 * 연산자 우선순위를 고려한다면 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 되지만
		 * 논리적으로 먼저 실행하는 내용을 괄호로 묶어주면 코드를 읽기에 좋다. */
		char ch3 = 'f';
		System.out.println("영문자인지 확인 : " + ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z')));
		
		
		
		
		
		
		
	}

}
