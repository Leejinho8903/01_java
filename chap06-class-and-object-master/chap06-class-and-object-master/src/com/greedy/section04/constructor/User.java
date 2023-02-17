package com.greedy.section04.constructor;

public class User {
	
	/* 필드 선언부 */
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;
	
	/* 생성자 선언부 
	 * 작성 위치는 문법적으로 클래스 내부에 작성하면 되지만, 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례 */
	
	/* 생성자의 사용 목적
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
	 * 2. 매개변수 생성자는 인스턴스 생성 시 바로 필드 초기화하는 목적
	 * 3. 작성한 생성자 이외에는 인스턴스 생성 방법을 제공하지 않는다는 의미 (인스턴스 생성 방법 제한)
	 * */
	
	/* 기본 생성자(default constructor) */
	public User() {
		System.out.println("User 클래스의 기본 생성자 호출함...");
	}
	
	/* 초기화 할 필드가 여러 개 있는 경우, 초기화 하고 싶은 필드의 갯수별로 생성자를 여러 개 만들 수 있다. */
	/* 매개변수가 있는 생성자 1 */
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		System.out.println("User 클래스의 id, pwd, name을 초기화 하는 생성자 호출함...");
	}
	
	/* 매개변수가 있는 생성자 2 */
	public User(String id, String pwd, String name, java.util.Date enrollDate) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
		/* this() : 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문 
		 * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 컴파일 에러 발생 */
		this(id, pwd, name);
		this.enrollDate = enrollDate;
		System.out.println("User 클래스의 모든 필드를 초기화 하는 생성자 호출함...");
	}
	
	/* 메소드 선언부 */
	/* getter, setter 작성해야 하지만 생략 */
	
	/* 모든 필드가 가지고 있는 값을 문자열로 만들어 반환하는 메소드 */
	public String getInformation() {
		return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate="
				+ this.enrollDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}









