package com.greedy.section03.increment_decrement_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 증감 연산자 */
		/* 피연산자의 앞 or 뒤에 사용이 가능하다. */
		/* ++ : 1 증가의 의미
		 * -- : 1 감소의 의미 */
		
		int num = 20;
		
		num++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		/* 다른 연산자와 함께 사용할 때는 전위/후위 연산의 구분이 필요하다. */
		int firstNum = 20;
		int result1 = firstNum++ * 3;
		
		System.out.println("firstNum : " + firstNum);
		System.out.println("result1 : " + result1);
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;
		
		System.out.println("secondNum : " + secondNum);
		System.out.println("result2 : " + result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
