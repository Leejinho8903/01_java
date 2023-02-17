package com.greedy.section02.superkeyword;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		/* Product 기본 생성자로 인스턴스 생성 후 정보 출력 */
		Product product1 = new Product();
		System.out.println(product1.getInformation());
		
		/* Product 모든 필드 초기화 생성자로 인스턴스 생성 후 정보 출력 */
		Product product2 = new Product("s-01234", "삼성", "갤럭시z폴드2", 2398000, new Date());
		System.out.println(product2.getInformation());
		
		/* Computer 기본 생성자로 인스턴스 생성 후 정보 출력 */
		Computer computer1 = new Computer();
		System.out.println(computer1.getInformation());
		
		/* Computer의 모든 필드를 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
		Computer computer2 = new Computer("퀼컴 스냅드래곤", 512, 12, "안드로이드");
		System.out.println(computer2.getInformation());
		
		/* Computer의 부모 필드도 함께 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
		Computer computer3 = new Computer("s-01234", "삼성", "갤럭시z폴드2", 2398000, new Date(), "퀼컴 스냅드래곤", 512, 12, "안드로이드");
		System.out.println(computer3.getInformation());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
