package com.greedy.section03.interfaceimplements;

public class Product extends java.lang.Object implements InterProduct, java.io.Serializable {

	/* 클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용한다. 
	 * 또한, 인터페이스는 다중 상속 받을 수 있고
	 * extends로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스 추가 상속이 가능하다. */
	
	/* InterProduct를 상속 받으면 오버라이딩 해야하는 메소드의 강제성이 부여 되기 때문에 
	 * 인터페이스에 작성한 추상 메소드를 전부 오버라이딩 해야 한다. */
	@Override
	public void nonStaticMethod() {
		System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨...");
	}

	@Override
	public void abstMethod() {
		System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출됨...");
	}
	
	/* static 메소드는 오버라이딩 할 수 없다. */
//	@Override
//	public static void staticMethod() {}
	
	
	/* default 키워드는 interface 내에서만 작성 가능하다. */
//	public default void defaultMethod() {}
	
	/* default 키워드를 제거하면 오버라이딩 가능하다. */
	@Override
	public void defaultMethod() {
		System.out.println("Product 클래스의 defaultMethod 호출됨...");
	}
	
	
	
	
	
	
	
	
	
	
	

}
