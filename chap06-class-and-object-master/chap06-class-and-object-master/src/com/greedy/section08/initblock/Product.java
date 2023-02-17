package com.greedy.section08.initblock;

public class Product {
	
	/* 1. 필드를 초기화 하지 않으면 JVM이 정한 기본 값으로 객체가 생성된다. */
//	private String name;
//	private int price;
//	private static String brand;
	
	/* 2. 명시적 초기화 */
	private String name = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼송";
	
	/* 3. 초기화 블록 */
	/* 인스턴스 초기화 블록 */
	{
		name = "사이언";
		price = 600000;
		
		/* 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행 된 정적 필드에
		 * 인스턴스 초기화 블럭에서 대입한 값으로 덮어쓰게 되는 것이다. */
		brand = "사과";
		
		System.out.println("인스턴스 초기화 블럭 동작함...");
		
	}
	
	/* static 초기화 블록 */
	static {
		brand = "헬지";
		
		/* static 초기화 블록에서는 non-static 필드를 초기화 하지 못한다.
		 * 정적 초기화 블럭의 동작 시점(프로그램 실행 시)에는 인스턴스가 아무것도 존재하지 않기 때문에
		 * 존재하지 않는 인스턴스 변수에 초기화 하는 것은 시기상 불가능하다. */
//		name = "아이뽕";
//		price = 2000000;
		System.out.println("static 초기화 블럭 동작함...");
	}
	
	/* 4. 생성자 */
	public Product() {
		System.out.println("기본 생성자 호출됨...");
	}
	
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		Product.brand = brand;
		System.out.println("매개변수 생성자 호출됨...");
	}
	
	public String getInformation() {
		return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
