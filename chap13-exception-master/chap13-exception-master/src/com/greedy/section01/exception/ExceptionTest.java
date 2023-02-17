package com.greedy.section01.exception;

public class ExceptionTest {
	
	/* 예외를 발생시키는 메소드를 하나 작성한다. */
	public void checkEnoughMoney(int price, int money) throws Exception {
		
		System.out.println("가지고 계신 돈은 " + money + "원 입니다.");
		
		if(money >= price) {
			System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
		} else {
			/* 강제로 예외를 발생시킨다. 
			 * 예외를 발생 시킨 뒤 메소드 헤드에 throws 구문을 추가한다.
			 * 예외를 발생 시킨 쪽에서는 throws로 예외에 대한 책임을 위임해서 해당 예외에 대한 처리를 강제화 시킨다. */
			throw new Exception();
		}
		
		/* 예외가 발생하지 않은 경우에만 실행한다. */
		System.out.println("즐거운 쇼핑하세요.");
	}
	
	
	
	
	
	
	
}
