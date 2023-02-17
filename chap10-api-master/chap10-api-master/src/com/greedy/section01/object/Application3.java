package com.greedy.section01.object;

public class Application3 {

	public static void main(String[] args) {
		
		/* Object 클래스의 명세에 작성 된 일반 규약에 따르면 equals 메소드를 재정의하는 경우
		 * 반드시 hashCode 메소드도 재정의 하도록 되어 있다.
		 * 만약 hashCode를 재정의하지 않으면 같은 값을 가지는 동등 객체는 같은 해쉬코드 값을 가져야 한다는
		 * 규약에 위반되게 된다. (강제성까지는 없지만 규약대로 작성하는 것이 좋다) */
		
		Book book1 = new Book(1, "홍길동전", "허균", 50000);
		Book book2 = new Book(1, "홍길동전", "허균", 50000);
		
		System.out.println("book1의 hashcode : " + book1.hashCode());
		System.out.println("book2의 hashcode : " + book2.hashCode());
		
		
	}

}
