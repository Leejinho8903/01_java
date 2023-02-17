package com.greedy.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
	
	/* 1. 기본 자료형 */
	public void testPrimaryTypeParameter(int num) {
		System.out.println("매개변수로 전달 받은 값 : " + num);
		num += 10;
	}
	
	/* 2. 기본 자료형 배열 */
	public void testPrimaryTypeArrayParameter(int[] iarr) {
		
		/* 배열의 주소가 전달 된다.
		 * 즉, 인자로 전달하는 배열과 매개변수로 전달 받은 배열은 서로 동일한 배열을 가리킨다. (얕은 복사) */
		System.out.println("매개변수로 전달 받은 값 : " + iarr);
		
		System.out.println(Arrays.toString(iarr));
		
		/* 메소드 내에서 배열의 값을 변경하면 호출한 main 메소드에서도 변경 된 값을 확인할 수 있다. */
		iarr[0] = 99;
	}
	
	/* 3. 클래스 자료형 */
	public void testClassTypeParameter(Rectangle rectangle) {
		
		System.out.println("매개변수로 전달 받은 값 : " + rectangle);

		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getHeight());
		
		rectangle.setWidth(100.0);
		rectangle.setHeight(100.0);
	}
	
	/* 4. 클래스 자료형 배열 - 추후 학습 */
	
	/* 5. 가변 인자 */
	public void testVariableLengthArrayParameter(String name, String... hobby) {
		
		/* 가변 인자 배열은 몇 개가 전달 될지 모르는 상황이기 때문에
		 * 이름과 구분하기 위해 뒤쪽에 작성해야 하며 앞 쪽에 작성하는 경우 에러가 발생한다. */
		
		/* 가변인자는 배열로 취급된다. */
		System.out.println("이름 : " + name);
		System.out.println("취미의 개수 : " + hobby.length);
		System.out.println("취미 : " + Arrays.toString(hobby));
		
	}
	
	/* 가변 인자를 매개변수로 이용한 메소드는 모호성으로 인해 오버로딩 하지 않는 것이 좋다. */
	//public void testVariableLengthArrayParameter(String... hobby) {}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}
