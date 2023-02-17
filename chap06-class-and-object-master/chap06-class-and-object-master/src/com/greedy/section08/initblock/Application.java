package com.greedy.section08.initblock;

public class Application {
	
	public static void main(String[] args) {
		
		/* 초기화 블럭과 초기화 순서 */
		
		Product product = new Product();
		System.out.println(product.getInformation());
		
		Product product2 = new Product("대륙폰", 300000, "샤우미");
		System.out.println(product2.getInformation());
		
		
	}

}
