package com.greedy.section01.method;

public class Application6 {

	public static void main(String[] args) {
	
		/* 메소드 리턴 값 테스트 */
		/* 반환 값이 있는 메소드를 호출만 하면 아무런 내용이 출력 되지 않는다.
		 * 출력하는 명령어가 존재하지 않기 때문이다.
		 * 반환 값이 있는 메소드를 호출 할 때는 반환 값을 변수에 담거나, 
		 * 동작하고자 하는 메소드 안에서 호출한다. 
		 * */
		Application6 app6 = new Application6();
		app6.testMethod();
		
		String returnText = app6.testMethod();
		System.out.println(returnText);
		
		System.out.println(app6.testMethod());
		
	}
	
	/* public 뒤에 바로 return으로 가지고 갈 타입을 명시한다. 
	 * 아무 값도 리턴하지 않을 경우 void, 값을 반환하는 경우 반환 값의 자료형을 작성해야 한다. */
	public String testMethod() {
		
		return "Hello World";
	}
	

}
