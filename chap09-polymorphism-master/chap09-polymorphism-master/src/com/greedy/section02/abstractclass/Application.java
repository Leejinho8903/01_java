package com.greedy.section02.abstractclass;

public class Application {

	public static void main(String[] args) {
		
		/* 추상 클래스는 인스턴스 생성 불가 */
//		Product product = new Product();
		
		/* 추상 클래스를 상속 받은 타입을 이용해서 인스턴스 생성 */
		SmartPhone smartPhone = new SmartPhone();
		
		/* SmartPhone은 SmartPhone 타입이기도 하지만 Product 타입이기도 하다. */
		System.out.println(smartPhone instanceof SmartPhone);
		System.out.println(smartPhone instanceof Product);
		
		/* 다형성을 적용해서 추상 클래스를 레퍼런스 타입으로 활용할 수 있다. */
		Product product = new SmartPhone();
		
		/* 동적 바인딩에 의해 SmartPhone의 메소드가 호출 된다. */
		product.abstMethod();
		
		/* 추상 클래스가 가진 메소드도 호출 할 수 있다. */
		product.nonStaticMethod();
		Product.staticMethod();
		
		/* 추상 클래스를 사용하는 이유?
		 * 여러 클래스를 그룹화하여 필수 기능을 정의하고 오버라이딩 강제성을 부여해 개발 시 일관된 인터페이스를 제공
		 * */
		
	}

}
