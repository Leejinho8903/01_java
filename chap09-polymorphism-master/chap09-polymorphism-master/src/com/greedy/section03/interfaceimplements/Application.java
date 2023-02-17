package com.greedy.section03.interfaceimplements;

public class Application {

	public static void main(String[] args) {
		
		/* 인터페이스
		 * : 자바의 클래스와 유사한 형태이지만 추상 메소드와 상수 필드만 가질 수 있는 클래스의 변형체
		 * */
		
		/* 인스턴스를 생성하지 못하고 생성자 자체가 존재하지 않는다. */
//		InterProduct interProduct = new InterProduct();
		
		/* 인터페이스를 레퍼런스 타입으로 사용할 수 있다. */
		InterProduct interProduct = new Product();
		
		/* 인터페이스의 추상 메소드를 오버라이딩한 메소드로 동적 바인딩에 의해 호출 된다. */
		interProduct.nonStaticMethod();
		interProduct.abstMethod();
		
		/* 오버라이딩 하지 않으면 인터페이스의 default 메소드로 호출 된다.
		 * 오버라이딩 하면 Product의 메소드로 호출 된다. */
		interProduct.defaultMethod();
		
		/* static 메소드는 인터페이스명.메소드명(); 으로 호출한다. */
		InterProduct.staticMethod();
		
		/* 상수 필드는 인터페이스명.필드명으로 접근한다. */
		System.out.println(InterProduct.MAX_NUM);
		System.out.println(InterProduct.MIN_NUM);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
