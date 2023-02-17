package com.greedy.section06.statickeyword;

public class StaticFieldTest {
	
	/* non-static 필드와 static 필드 선언 */
	private int nonStaticCount;
	private static int staticCount;
	
	/* 두 필드의 값을 확인하는 getter 메소드 */
	
	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	
	/* static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근한다. */
	public int getStaticCount() {
		return StaticFieldTest.staticCount;
	}

	/* 두 필드의 값을 1 증가시키는 메소드 */
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	
	public void increaseStaticCount() {
		StaticFieldTest.staticCount++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
