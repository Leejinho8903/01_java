package com.greedy.section04.constructor;

public class Application {

	public static void main(String[] args) {
		
		/* 생성자는 인스턴스를 생성할 수 있는 다양한 방법을 제공하며, 제공하는 생성자 외에는 인스턴스를 생성하는 방법을 제한한다.
		 * 필드 값 초기화의 용도로 가장 많이 사용 되며, 여러 개의 setter 메소드를 호출한 것과 같은 효과를 가질 수 있다.
		 * */
		
		/* 클래스 내에 생성자가 정의 되어 있지 않다면 컴파일러에 의해 기본 생성자가 자동으로 추가된다.
		 * 하지만 생성자가 하나라도 정의 되어 있다면 컴파일러는 기본 생성자를 자동으로 추가하지 않으므로 주의한다.
		 * */

		/* 기본 생성자 호출 */
		User user1 = new User();
		System.out.println(user1.getInformation());
		
		/* 매개변수 생성자 1 호출 */
		User user2 = new User("user01", "pass01", "유관순");
		System.out.println(user2.getInformation());
		
		/* 매개변수 생성자 2 호출 */
		User user3 = new User("user02", "pass02", "홍길동", new java.util.Date());
		System.out.println(user3.getInformation());
		
		/* 정의 되지 않은 형식의 생성자는 호출 불가능 */
		//User user4 = new User("user03", "pass03");
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
