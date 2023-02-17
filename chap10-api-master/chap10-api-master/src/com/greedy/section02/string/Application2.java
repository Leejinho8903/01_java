package com.greedy.section02.string;

public class Application2 {

	public static void main(String[] args) {
		
		/* 문자열 객체 사용하는 방법 */
		/* "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.
		 * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
		 * */
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		
		/* 1,2의 주소값은 같고 3,4의 주소값은 다르지만 모두 동일한 hashCode 값이 나온다.
		 * 이는 동일한 문자열은 동일한 hashCode 값을 반환하도록 String 클래스에 재정의 되어 있기 때문이다. 
		 * */
		System.out.println("str1 hashCode : " + str1.hashCode());
		System.out.println("str2 hashCode : " + str2.hashCode());
		System.out.println("str3 hashCode : " + str3.hashCode());
		System.out.println("str4 hashCode : " + str4.hashCode());
		
		/* 문자열은 "불변"이라는 특징을 가진다.
		 * 기존 문자열에 + 연산자를 수행하는 경우 문자열을 수정하는 것이 아니라 새로운 문자열을 할당하게 된다. */
		str2 += "oracle";
		
		/* str1, str2는 동일 인스턴스였지만 수정 후에는 다른 인스턴스가 된 것을 확인할 수 있다. */
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		/* 인스턴스 비교가 아니라 문자열 값을 비교하여 동일한 값을 가지면 true, 다른 값을 가지면 false를 반환하도록
		 * 오버라이딩 되어 있다. */
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		
		
		
		
		
		
		
	}

}
