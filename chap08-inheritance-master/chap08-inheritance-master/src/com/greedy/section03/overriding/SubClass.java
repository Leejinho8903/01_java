package com.greedy.section03.overriding;

public class SubClass extends SuperClass {

	/* 1. 메소드 이름 동일 
	 * 2. 메소드 리턴 타입 동일
	 * 3. 매개변수부 동일 */
	@Override
	public void method(int num) {}
	
	/* 4. private 메소드 오버라이딩 불가 */
//	@Override
//	private void privateMethod() {}
	
	/* 5. final 메소드 오버라이딩 불가 */
//	@Override
//	public final void finalMethod() {}
	
	/* 6. 부모 메소드의 접근 제한자와 같거나 더 넓은 범위로만 가능 */
//	@Override
//	void protectedMethod() {} 
	// 더 좁은 범위로는 변경 불가능(protected -> default)
	
	
	
	
	
	
	
	
	
}
