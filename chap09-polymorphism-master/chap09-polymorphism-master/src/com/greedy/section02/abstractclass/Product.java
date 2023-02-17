package com.greedy.section02.abstractclass;

/* 추상 클래스는 abstract 키워드를 작성한다. */
public abstract class Product {
	
	/* 추상 클래스는 필드를 가질 수 있다. */
	private int nonStaticField;
	private static int staticField;
	
	/* 추상 클래스는 생성자도 가질 수 있다.
	 * 하지만, 직접적으로 인스턴스를 생성할 수는 없다. */
	public Product() {}
	
	/* 추상 클래스는 일반적인 메소드를 가질 수 있다. */
	public void nonStaticMethod() {
		System.out.println("Product 클래스의 nonStaticMethod 호출함...");
	}
	
	public static void staticMethod() {
		System.out.println("Product 클래스의 staticMethod 호출함...");
	}
	
	/* 추상 메소드(미완성 메소드)를 가질 수 있다. 
	 * 추상 메소드를 1개 이상 가질 경우 반드시 추상 클래스여야 한다. 
	 * 추상 메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 작성하여 인스턴스 생성을 막을 수 있다. */
	public abstract void abstMethod();
	
}















