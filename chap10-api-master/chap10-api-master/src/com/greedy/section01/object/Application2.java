package com.greedy.section01.object;

public class Application2 {

	public static void main(String[] args) {

		/* java.lang.Object의 equals는 매개변수로 전달 받은 인스턴스와 == 연산하여 true or false를 반환한다.
		 * 즉, 동일한 인스턴스인지 비교하는 기능을 한다.
		 * 
		 * 동일 객체와 동등 객체
		 * 동일 객체 : 주소가 동일한 인스턴스
		 * 동등 객체 : 주소는 다르더라도 필드 값이 동일한 객체
		 * 
		 * 경우에 따라서는 동등 객체를 판단해야 하는 상황이 있다. 
		 * equals를 오버라이딩하여 각각의 필드가 동일한 값을 가지는지 확인하고 모든 필드 값이 같은 값을 가지는 경우 true,
		 * 아닌 경우 false를 반환하도록 한다.
		 * */
		Book book1 = new Book(1, "홍길동전", "허균", 50000);
		Book book2 = new Book(1, "홍길동전", "허균", 50000);
		
		System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
		System.out.println("두 인스턴스의 eqauls() 비교 : " + (book1.equals(book2)));
		
	}

}
