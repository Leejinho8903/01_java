package com.greedy.section06.finalkeyword;

public class FinalFieldTest {
	
	/* final은 변경 불가의 의미를 가진다.
	 * 따라서 초기 인스턴스가 생성 되고 나면 기본 값이 필드에 들어가게 되는데,
	 * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야 한다.
	 * 그렇지 않으면 컴파일 에러가 발생한다.
	 * */
	
	//private final int nonStaticNum;	//에러 발생
	
	/* 1. 선언과 동시에 초기화 한다. */
	private final int NON_STATIC_NUM = 1;
	
	/* 2. 생성자를 이용해 초기화 한다. */
	private final String NON_STATIC_NAME;
	
	//public FinalFieldTest() {} //NON_STATIC_NAME을 초기화 하지 않는 생성자는 선언할 수 없다.
	
	public FinalFieldTest(String nonStaticName) {
		this.NON_STATIC_NAME = nonStaticName;
	}
	
	/* static field에 final 사용 - 상수 필드 */
	private static final int STATIC_NUM = 1;
	
	/* 생성자를 이용한 초기화는 불가능하다.
	 * 생성자는 인스턴스가 생성 되는 시점에 호출 되기 때문에 그 전에는 초기화가 일어나지 못한다.
	 * static은 프로그램이 시작 될 때 할당 되기 때문에 결국 초기화가 되지 않은 상태로 선언 된 것과 동일하다.
	 * */
//	private static final double STATIC_DOUBLE;
//	
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
