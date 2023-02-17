package com.greedy.section01.method;

public class Application9 {

	public static void main(String[] args) {
		
		/* 다른 클래스에 작성한 메소드 호출하기 */
		int first = 100;
		int second = 50;
		
		/* 1. non-static 메소드 호출
		 * 클래스가 다르더라도 사용하는 방법은 동일하다.
		 * */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(first, second);
		System.out.println("두 수 중 최소 값은 " + min + "이다.");
		
		/* 2. static 메소드 호출 
		 * 다른 클래스에서 작성 된 static 메소드를 호출할 때는 클래스명을 반드시 기술한다.
		 * */
		int max = Calculator.maxNumberOf(first, second);
		System.out.println("두 수 중 최대 값은 " + max + "이다.");
	}
	
	
	
	
	
	

}
