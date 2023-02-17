package com.greedy.section01.method;

public class Application8 {

	public static void main(String[] args) {
		
		/* static 메소드 호출 */
		/* main 메소드에는 public과 void 사이에 static이라는 키워드가 있다.
		 * static 키워드에 대해서는 객체에서 다룰 예정으로, static 메소드 호출법을 먼저 알아본다.
		 * static 메소드이건 non-static 메소드이건 메소드의 동작 흐름은 동일하다.
		 * */
		
		/* static 메소드를 호출하는 방법
		 * 클래스명.메소드명();
		 * */
		System.out.println("20과 30의 합 : " + Application8.sumTwoNumbers(20, 30));
		
		/* 동일한 클래스 내에 작성 된 static 메소드는 클래스명 생략이 가능하다. */
		System.out.println("20과 30의 합 : " + sumTwoNumbers(20, 30));

	}
	
	public static int sumTwoNumbers(int first, int second) {
		
		return first + second;
	}

}
