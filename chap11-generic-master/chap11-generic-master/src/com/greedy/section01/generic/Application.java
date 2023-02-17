package com.greedy.section01.generic;

public class Application {

	public static void main(String[] args) {
		
		/* 제네릭(generic)
		 * 제네릭의 사전적인 의미는 일반적인이라는 의미이다.
		 * 자바에서 제네릭은 데이터의 타입을 일반화 한다는 의미를 가진다.
		 * JDK 1.5버전부터 추가된 문법이다.
		 * 
		 * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법이다.
		 * 컴파일 시에 미리 타입 검사를 시행하면 클래스나 메소드 내부에서 사용 되는 객체의 타입 안정성을 높일 수 있다.
		 * (잘못 된 타입인 경우 컴파일 에러를 발생시킨다.)
		 * 반환 값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
		 * (instanceof 비교 및 다운 캐스팅 작성이 불필요하다.)
		 * */
		
		/* 타입을 Integer로 인스턴스를 생성하는 경우 */
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		
		/* 메소드의 인자 및 반환 값 모두 Integer 타입인 것을 알 수 있다. */
		gt1.setValue(10);
		System.out.println(gt1.getValue());
		
		/* 타입을 String으로 인스턴스를 생성하는 경우 */
		GenericTest<String> gt2 = new GenericTest<String>();
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		
		/* JDK 1.7부터 타입 선언 시 타입 변수가 작성 되면 타입 추론이 가능하기 때문에
		 * 생성자 쪽의 타입을 생략하고 작성할 수 있다. 
		 * 단, 빈 다이아몬드 연산자는 사용해야 한다.*/
		GenericTest<Double> gt3 = new GenericTest<>();
		
		
		
		
		
		
		
	}

}
