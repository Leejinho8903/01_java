package com.greedy.section01.exception;

public class Application2 {

	public static void main(String[] args) {
		
		/* 2. try-catch를 이용한 방법 */
		ExceptionTest et = new ExceptionTest();
		
		try {
			/* 예외 발생 가능성이 있는 메소드는 try 블럭 안에서 호출한다. */
			
			et.checkEnoughMoney(10000, 50000);	//정상 동작
			et.checkEnoughMoney(50000, 10000);	//예외 발생
			
			/* 예외가 발생한 위치 하단 코드는 동작하지 않는다. */
			System.out.println("============ 상품 구입 가능 =============");
			
		} catch (Exception e) {
			/* 위의 메소드 호출 시 예외가 발생하는 경우 catch 블럭의 코드를 실행한다. */
			System.out.println("=========== 상품 구입 불가 =============");
		}
		
		/* catch 블럭 동작 후 프로그램 정상 흐름으로 돌아온다. */
		System.out.println("프로그램을 종료합니다.");
	}

}
