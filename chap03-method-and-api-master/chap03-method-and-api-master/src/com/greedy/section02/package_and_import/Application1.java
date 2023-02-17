package com.greedy.section02.package_and_import;

public class Application1 {

	public static void main(String[] args) {
		
		/* 패키지 : 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 그룹으로 단위를 구성하는 것
		 * 같은 패키지 내에는 동일한 이름의 클래스를 만들 수 없지만,
		 * 패키지가 다르면 동일한 이름의 클래스명을 만들 수 있는데 이는 풀 클래스명은 패키지를 포함하기 때문이다.
		 * 지금까지 클래스명에 패키지를 함께 사용하지 않은 이유는 동일한 패키지 내에서 사용했기 때문이다.
		 * 다른 패키지에 존재하는 클래스를 사용할 때는 클래스명 앞에 패키지명을 명시해야 한다.
		 * */
		
		com.greedy.section01.method.Calculator calc = new com.greedy.section01.method.Calculator();
		
	}

}
