package com.greedy.section01.method;

/**
 * <pre>
 * Class : Application4
 * Comment : 여러 개의 전달 인자와 매개변수를 이용한 메소드 호출
 * History
 * 2002/12/22 (우별림) 처음 작성함
 * 2022/12/22 (아무개) 수정함
 * </pre>
 * @author 우별림
 * @version 1.0.0
 * */
public class Application4 {

	public static void main(String[] args) {
		
		/* 각각의 전달인자를 변수로 메소드 호출 시 전달 */
		String name = "신사임당";
		int age = 40;
		char gender = 'F';
		
		Application4 app4 = new Application4();
		app4.testMethod(name, age, gender);

		// 값의 개수는 맞지만 순서가 다르게 전달 되면 호출 되지 못한다.
		//app4.testMethod(age, name, gender);
	}
	
	/**
	 * <pre>
	 * 이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공합니다.
	 * </pre>
	 * @param name 출력할 이름을 전달해주세요.
	 * @param age 출력할 나이를 전달해주세요.
	 * @param gender 출력할 성별을 전달해주세요. 성별은 변경되지 않을 것을 보장합니다.
	 * */
	public void testMethod(String name, int age, final char gender) {
		
		/* 매개변수도 일종의 지역변수이며 final 키워드를 사용할 수 있다.
		 * final 매개변수는 상수 네이밍 규칙을 선택적으로 따른다. (대문자로 작성해도 되고 소문자로 작성해도 된다) */
		//gender = 'M';
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
