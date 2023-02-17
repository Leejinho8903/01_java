package com.greedy.section05.parameter;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		/* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하여 호출할 수 있다.
		 * 
		 * 매개변수(parameter)로 사용 가능한 자료형
		 * 1. 기본 자료형
		 * 2. 기본 자료형 배열
		 * 3. 클래스 자료형
		 * 4. 클래스 자료형 배열
		 * 5. 가변인자
		 * */
		
		ParameterTest pt = new ParameterTest();
		
		/* 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출 확인
		 * (기본자료형 8가지 모두 가능하다) */
		int num = 20;
		pt.testPrimaryTypeParameter(num);
		System.out.println("메소드 호출 후 num : " + num);
		
		/* 2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
		int[] iarr = {1, 2, 3, 4, 5};
		
		System.out.println("인자로 전달하는 값 : " + iarr);
		
		pt.testPrimaryTypeArrayParameter(iarr);
		System.out.println(Arrays.toString(iarr));
		
		/* 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 확인 */
		Rectangle r = new Rectangle(10.0, 10.0);
		
		System.out.println("인자로 전달하는 값 : " + r);
		
		pt.testClassTypeParameter(r);
		
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		
		/* 5. 가변 인자 */
		/* 인자로 전달하는 값의 개수가 정해져 있지 않은 경우 가변 인자를 활용할 수 있다. */
		pt.testVariableLengthArrayParameter("홍길동");	// 가변 인자는 전달하지 않아도 된다.
		pt.testVariableLengthArrayParameter("유관순", "축구", "농구", "배구");
		pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스", "서예"});	//배열의 형태로도 전달 가능하다.
		
		
		
		
		
		
		
		
		
		
		
	}

}






