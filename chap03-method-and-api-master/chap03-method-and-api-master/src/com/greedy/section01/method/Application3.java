package com.greedy.section01.method;

public class Application3 {

	public static void main(String[] args) {
		
		/* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출 
		 * 
		 * 지금까지 우리가 배운 변수는 모두 지역 변수에 해당한다.
		 * 다양한 변수들이 존재하는데 객체 챕터에서 모두 배우게 될 것이다.
		 * 1. 지역변수
		 * 2. 매개변수
		 * 3. 전역변수(필드)
		 * 4. 클래스(static)변수
		 * 
		 * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역 변수의 스코프라고 한다.
		 * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
		 * 이 때 전달하는 값을 전달인자, 메소드 선언 부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수라 부른다.
		 * */
		
		Application3 app3 = new Application3();
		
		/* 1. 전달 인자로 값 전달 테스트 */
		/* 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과 갯수, 순서가 일치하게 값을 넣어 호출해야 한다. */
		app3.testMethod(20);
		//app3.testMethod();
		//app3.testMethod("20");
		//app3.testMethod(20, 30, 40);
		
		/* 2. 변수에 저장한 값 전달 테스트 */
		/* 2-1. 변수에 저장 된 값을 이용하여 값을 전달할 수 있다. */
		int age = 20;
		app3.testMethod(age);
		
		/* 2-2. 자동 형변환을 이용하여 값 전달을 할 수 있다. */
		byte byteAge = 10;
		app3.testMethod(byteAge);
		
		/* 2-3. 강제 형변환을 이용하여 값 전달을 할 수 있다. */
		long longAge = 30;
		app3.testMethod((int)longAge);	// 데이터 손실 주의
		
		/* 2-4. 연산 결과를 이용해서 값 전달을 할 수 있다. */
		app3.testMethod(age * 3);
	}
	
	public void testMethod(int age) {
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}
	
	
	
	
	
	
	
	
	
	

}
