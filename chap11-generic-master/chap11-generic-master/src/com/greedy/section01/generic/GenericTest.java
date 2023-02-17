package com.greedy.section01.generic;

public class GenericTest<T> {
	/* 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성한다.
	 * 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
	 * 다이아몬드 연산자 내부에 작성한 T를 타입 변수라고 부르며 타입 변수를 자료형 대신 사용한다. 
	 * 가상으로 존재하는 타입으로 T가 아닌 영문자를 사용해도 무방하다.
	 * 
	 * 사용하는 쪽에서 작성한 제네릭 클래스를 이용할 시 실제 사용할 타입을 타입 변수 자리에 맞추어 넣어주면
	 * 컴파일 시점에 타입이 결정되게 된다.
	 * */
	
	/* 현재 해당 필드는 타입이 결정되지 않은 상태이다. */
	private T value;
	
	/* getter, setter 작성 시에도 구체적인 타입 대신 T를 이용한다. */
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}



