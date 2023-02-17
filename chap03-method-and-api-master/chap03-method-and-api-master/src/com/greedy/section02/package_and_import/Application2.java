package com.greedy.section02.package_and_import;

import com.greedy.section01.method.Calculator;

public class Application2 {

	public static void main(String[] args) {
		
		/* 임포트 : 매번 다른 클래스의 패키지명까지 기술하는 것은 번거로우므로 패키지명을 생략하고 사용할 수 있도록
		 * import 구문을 사용한다. import는 package 선언문과 class 선언문 사이에 작성하며
		 * 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 * */
		
		Calculator calc = new Calculator();
		
	}

}
