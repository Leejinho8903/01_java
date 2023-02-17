package com.greedy.section07.kindsOfVariable;

public class KindsOfVariable {	// 클래스 영역의 시작

	/* 클래스 영역에 작성하는 변수를 필드라고 한다. */
	
	/* non-static field를 인스턴스 변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미) */
	private int globalNum;
	
	/* static field를 클래스 변수(정적 필드)라고 한다. (정적 메모리 영역에 생성 되는 변수라는 의미) */
	private static int staticNum;
	
	public void testMethod(int num) {	//testMethod 영역의 시작
		
		/* 메소드 영역에서 작성하는 변수를 지역 변수라고 한다.
		 * 매개변수도 지역 변수의 일종이다.
		 * 지역변수는 메소드 호출 시 stack에 공간을 할당 받아 생성된다. */
		int localNum;
		
		System.out.println(num);		//매개변수는 호출 시 값이 넘어와서 변경 되기 때문에 초기화가 필요 없다.
		//System.out.println(localNum);	//지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화 되어야 한다.
		
		System.out.println(globalNum);	//전역 변수는 클래스 전역에서 사용 가능하다.
		System.out.println(staticNum);
		
	}	//testMethod 영역의 끝
	
	public void testMethod2() {	//testMethod2 영역의 시작
		
		// 지역 변수는 해당 지역(블럭 내)에서만 사용 가능하다.
//		System.out.println(num);
//		System.out.println(localNum);
		System.out.println(globalNum);
		System.out.println(staticNum);
		
	}	//testMethod2 영역의 끝
	
	
}	// 클래스 영역의 끝












