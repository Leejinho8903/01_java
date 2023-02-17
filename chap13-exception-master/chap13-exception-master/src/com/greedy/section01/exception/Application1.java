package com.greedy.section01.exception;

public class Application1 {

	public static void main(String[] args) throws Exception {
		
		/* 예외 처리 방법 
		 * 1. throws로 위임
		 * 2. try-catch로 처리 */
		
		/* 1. throws로 위임 */
		ExceptionTest et = new ExceptionTest();
		
		/* 정상 동작 */
		et.checkEnoughMoney(10000, 50000);
		
		/* 예외 발생 
		 * 메소드 내부에서 예외 발생 시 이후 구문은 동작하지 않고 호출한 곳으로 되돌아 온다. */
		et.checkEnoughMoney(50000, 10000);
		
		/* 메인 메소드 또한 예외를 처리하지 않고 위임했기 때문에 프로그램은 비정상적으로 종료 되고
		 * 아래 구문을 출력 되지 않는다. */
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
