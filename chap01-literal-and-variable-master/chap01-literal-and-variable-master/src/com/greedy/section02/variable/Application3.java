package com.greedy.section02.variable;

public class Application3 {

	public static void main(String[] args) {
		
		/* 변수의 명명 규칙 */
		/* 변수의 이름을 지을 때 아무렇게나 짓는 것이 아니라 정해진 규칙이 있다.
		 * 실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 하고,
		 * 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
		 * */
		
		/* 1. 컴파일 에러를 발생시키는 규칙 */
		/* 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
		int age = 20;
		//int age = 30;
		
		/* 1-2. 예약어는 사용 불가능하다. */
		//boolean true = true;
		//int int = 10;
		
		/* 1-3. 변수명은 대소문자를 구분한다. */
		int Age = 20;
		int True = 10;
		
		/* 1-4. 변수명은 숫자로 시작할 수 없다. */
		//int 1age = 20;
		int age1 = 20;
		
		/* 1-5. 특수 기호는 '_'와 '$'만 사용 가능하다. */
		int _age = 20;
		int $harp = 20;
		//int sh@rp = 20;
		
		/* 2. 컴파일 에러는 발생하지 않지만 개발자끼리의 암묵적인 규칙 */
		/* 2-1. 변수명 길이 제한은 없지만 너무 긴 이름은 지양한다. */
		int abcdefghijklmnopqrstuvdjifaoewjifadpwiefsldfjei;
		
		/* 2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다. 
		 * (카멜 표기법, 낙타 표기법) 
		 * 자바에서는 클래스명만 유일하게 대문자로 시작하고 나머지는 소문자로 시작한다.
		 * */
		int maxAge = 20;
		int minAge = 10;
		
		/* 2-3. 단어와 단어 사이의 연결을 언더 스코어로 하지 않는다. */
		String user_name;
		String userName;
		
		/* 2-4. 한글로 변수명 짓는 것이 가능하지만, 권장하지 않는다. */
		int 나이;
		
		/* 2-5. 변수 안에 저장 된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다. */
		String s;
		String name;
		
		/* 2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다. */
		int sum = 0;
		int max = 10;
		int min = 0;
		int count = 1;
		
		/* 2-7. 명사형으로 작성할 수 있도록 한다. */
		String goHome;
		String home;
		
		/* 2-8. boolean 형은 의문문으로 가급적 긍정 형태로 네이밍한다. */
		boolean isAlive = true;
		boolean isDead = false;
		
	}

}
