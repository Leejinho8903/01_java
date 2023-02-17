package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
	
	public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
		// throws Exception - 3개의 예외 클래스는 모두 Exception 클래스의 후손이므로 Exception만으로도 작성할 수 있다 (다형성)
				
		/* section01에서는 Exception을 발생시켰지만 그냥 예외라는 의미가 되므로
		 * 예외 클래스의 이름만으로 어떤 예외가 발생했는지 알 수 있도록 사용자 정의 예외를 사용한다.
		 * */
		
		/* 상품 가격이 음수인지 확인하고 음수인 경우 예외 발생 */
		if(price < 0) {
			throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
		}
		
		/* 가진 돈도 음수인지 확인하고 음수인 경우 예외 발생 */
		if(money < 0) {
			throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
		}
		
		/* 위의 두 값이 정상 입력 되었더라도 상품 가격이 가진 돈 보다 큰 경우 예외 발생 */
		if(money < price) {
			throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
		}
		
		/* 모든 조건을 만족하는 경우 정상적으로 물건 구입 가능 */
		System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~");
	
	}

}
