package com.greedy.section03.dto;

public class MemberDTO {
	
	/* 취급하려고 하는 회원 정보를 구상해서 필드를 작성한다. */
	private int number;
	private String name;
	private int age;
	private double height;
	private boolean isActivated; 

	/* 설정자(setter) 작성 규칙 
	 * : 필드 값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언
	 *   호출 당시 전달 되는 매개변수의 값을 이용하여 필드의 값을 변경
	 * 
	 * [표현식]
	 * public void set필드명(매개변수) {
	 * 		필드 = 매개변수;
	 * }
	 * */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	/* 접근자(getter) 작성 규칙
	 * : 필드의 값을 반환 받을 목적의 메소드 집합을 의미한다.
	 *   각 접근자는 하나의 필드에만 접근하도록 한다.
	 *   필드에 접근해서 기록 된 값을 return을 이용하여 반환하며, 이 때 반환 타입은 반환하려는 값의 자료형과 일치시킨다.
	 *   
	 * [표현식]
	 * public 반환형 get필드명() {
	 * 		return 필드명;
	 * }
	 * */
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	/* boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적인 관례이다. */
	public boolean isActivated() {
		return isActivated;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
