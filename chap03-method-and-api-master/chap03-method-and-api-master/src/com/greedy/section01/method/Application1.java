package com.greedy.section01.method;

public class Application1 {

	public static void main(String[] args) {
		
		/* 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 * 자세한 메소드 사용법은 객체 부분에서 다시 다루게 되니 지금은 호출 흐름에 대해 이해할 수 있도록 한다.
		 * */
		
		System.out.println("main 시작됨...");
		
		/* 작성한 메소드 호출 */
		/* 클래스명 사용할이름 = new 클래스명();  	: 객체 생성
		 * 사용할이름.메소드명();              	: 메소드 호출
		 * */
		Application1 app1 = new Application1();
		app1.methodA();
		
		
		System.out.println("main 종료됨...");
		
	}
	
	public void methodA() {
		
		System.out.println("methodA 호출함...");
		
		methodB();
		
		System.out.println("methodA 종료됨...");
		
	}
	
	public void methodB() {
		
		System.out.println("methodB 호출함...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
