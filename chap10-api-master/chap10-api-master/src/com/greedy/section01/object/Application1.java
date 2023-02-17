package com.greedy.section01.object;

public class Application1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "홍길동전", "허균", 50000);
		Book book2 = new Book(2, "목민심서", "정약용", 30000);
		Book book3 = new Book(3, "칭찬은 고래를 춤추게 한다", "고래", 40000);
		
		/* java.lang.Object 클래스의 toString() 메소드는 
		 * 인스턴스가 생성 될 때 사용한 full class name과 @ 그리고 16진수 해쉬코드가 문자열로 반환된다.
		 * 16진수 해쉬코드는 인스턴스의 주소를 가리키는 값으로 인스턴스마다 모두 다르게 반환된다. */
		System.out.println("book1.toString() : " + book1.toString());
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());
		
		/* 레퍼런스 변수만 출력하는 경우도 toString() 호출과 동일한 결과가 나온다.
		 * 이 말은 자동으로 toString() 메소드를 호출한다는 뜻이다.
		 * 이러한 점을 이용해서 toString() 메소드를 재정의해서 사용하게 된다. */
		System.out.println("book1 : " + book1);
		System.out.println("book2 : " + book2);
		System.out.println("book3 : " + book3);
		
		
		
		
		
		
	}

}
