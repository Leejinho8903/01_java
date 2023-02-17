package com.greedy.section06.statickeyword;

public class Application {

	public static void main(String[] args) {

		/* static : 정적 메모리 영역에 프로그램이 시작할 때 할당을 하는 키워드
		 *          인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
		 *          여러 인스턴스가 공유해서 사용할 목적의 공간이다.
		 * */
		
		/* static 키워드를 필드에서 사용할 때 */
		StaticFieldTest sft1 = new StaticFieldTest();
		
		StaticFieldTest sft3 = sft1;
		
		/* 현재 두 필드가 가지고 있는 값 확인 */
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
		
		/* 두 필드의 값 1씩 증가 후 값 확인 */
		sft1.increaseNonStaticCount();
		sft1.increaseStaticCount();
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
		
		/* 새로운 StaticFieldTest 객체 생성 */
		StaticFieldTest sft2 = new StaticFieldTest();
		System.out.println("non-static field : " + sft2.getNonStaticCount());
		System.out.println("static field : " + sft2.getStaticCount());
		
		/* 인스턴스 변수의 경우 sft1과 sft2 두 개의 인스턴스가 서로 값을 공유하지 못하고 
		 * 인스턴스를 생성할 때마다 0으로 초기화 되었다.
		 * 하지만 static 필드의 경우에는 클래스 변수 자체가 프로그램을 종료할 때까지 유지되고 있기 때문에
		 * 값을 유지하고 있다.
		 * => 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다.
		 * */
		
		/* static 키워드를 method에 작성 */
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		/* Static 메소드의 경우 인스턴스를 생성하지 않고 호출하는 방식으로 사용한다. */
		StaticMethodTest.staticMethod();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




