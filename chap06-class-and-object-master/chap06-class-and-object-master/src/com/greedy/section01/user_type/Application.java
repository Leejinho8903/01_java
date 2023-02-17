package com.greedy.section01.user_type;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		/* 회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 
		 * 취급하여 관리하려 한다. 
		 * */
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = 'M';
		String[] hobby = {"축구", "볼링", "테니스"};
		
		/* 이렇게 각각의 변수로 관리하게 되면 여러가지 단점이 있다.
		 * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
		 * 2. 모든 회원 정보를 인자로 메소드 호출 시 전달해야 하면 너무 많은 값들을 인자로 전달해야해서 한 눈에 안들어온다.
		 * 3. 리턴은 1개의 값만 가능하기 때문에 회원 정보를 묶어서 리턴 값으로 사용 할 수 없다.
		 * 
		 * => 그래서 서로 다른 자료형의 데이터를 사용자(개발자) 정의로 하나로 묶어서 새로운 타입을 정의할 수 있는 방법을 제공한다.
		 *    Member(회원 정보)라고 하는 새로운 타입을 정의해보자.
		 * */
		
		/* 사용자 정의 자료형 사용하기 */
		/* 1. 변수 선언 및 객체 생성 
		 * 자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문이다.
		 * 사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap 할당을 해야 한다.
		 * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드대로 객체(instance)가 생성 된다.
		 * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속 된 메모리 주소에서 사용하도록 heap에 공간을 만들었다.
		 * */
		Member member = new Member();
		
		/* 필드에 접근하기 위해서는 레퍼런스명.필드명으로 접근한다.
		 * '.'은 참조 연산자라고 하는데, 레퍼런스 변수가 참조하고 있는 주소로 접근한다는 의미를 가진다. 
		 * 각 공간에 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근) 
		 * */
		System.out.println(member.id);
		System.out.println(member.pwd);
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.gender);
		System.out.println(member.hobby);
		
		/* => heap에 생성 되기 때문에 JVM 기본 값으로 초기화 된다. */
		
		/* 2. 필드에 접근해서 변수 사용하듯 사용할 수 있다. */
		member.id = "user01";
		member.pwd = "pass01";
		member.name = "홍길동";
		member.age = 20;
		member.gender = 'M';
		member.hobby = new String[] {"축구", "볼링", "테니스"};
		
		/* 3. 값이 변경 되었는지 출력 확인 */
		System.out.println(member.id);
		System.out.println(member.pwd);
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.gender);
		System.out.println(member.hobby);
		System.out.println(Arrays.toString(member.hobby));
		
		
		
		
		
		
		
		
	}

}
