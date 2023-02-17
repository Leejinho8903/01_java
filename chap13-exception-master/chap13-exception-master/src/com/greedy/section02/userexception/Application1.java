package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application1 {

	public static void main(String[] args) {
		
		/* 사전에 정의 되어 있는 Exception의 종류는 굉장히 많이 있다.
		 * 하지만 RuntimeException의 후손 대부분은 예외 처리를 강제화 하지 않는다.
		 * 간단한 조건문 등으로 처리가 가능하기 때문에 따로 강제화 하지 않았다.
		 * */
		
		/* Exception 클래스 내부에는 별도의 기능은 없고 생성자만 존재한다. 
		 * 기본적인 기능은 부모인 Throwable 쪽에 정의 되어 있다.
		 * 사전에 정의 된 예외 클래스 외에 개발자가 원하는 명칭의 예외 클래스를 작성하는 것이 가능하다.
		 * extends Exception으로 예외 처리 클래스를 상속 받아 더 구체적인 예외 이름을 정의하는 것이다.
		 * */
		
		ExceptionTest et = new ExceptionTest();
		
		/* 각각의 예외 상황에 다른 조치가 필요할 경우 예외마다 catch 블럭을 나눠서 작성할 수 있다.
		try {
			et.checkEnoughMoney(50000, 30000);
		} catch (PriceNegativeException e) {
			e.printStackTrace();
		} catch (MoneyNegativeException e) {
			e.printStackTrace();
		} catch (NotEnoughMoneyException e) {
			e.printStackTrace();
		}
		*/
		
		/* 모든 예외 상황에 같은 조치를 할 경우 catch 블럭을 multi-catch 블럭으로 작성할 수 있다. */
		try {
			/* 상품 가격보다 가진 돈이 작은 경우 */
			//et.checkEnoughMoney(50000, 30000);
			
			/* 상품 가격을 음수로 입력한 경우 */
//			et.checkEnoughMoney(-50000, 30000);
			
			/* 가진 돈을 음수로 입력한 경우 */
//			et.checkEnoughMoney(50000, -30000);
			
			/* 정상 동작 */
			et.checkEnoughMoney(30000, 50000);
			
		} catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {			
			e.printStackTrace();	//콘솔창에 예외 출력 메소드
		}
		
		/* 예외가 발생하더라도 catch 블럭 실행 후 정상 흐름으로 돌아온다. */
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
