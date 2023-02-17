package com.greedy.section03.filterstream.dto;

import java.io.Serializable;

/* 직렬화 대상 클래스에 Serializable 인터페이스만 구현하면 직렬화가 필요한 경우 데이터 직렬화 처리가 수행된다. */
public class MemberDTO implements Serializable {
	
	/* SerialVersionUID를 작성하지 않을 경우 JVM이 자동으로 SerialVersionUID를 생성해서 동작시키므로 오류가 발생하지는 않았다.
	 * 다만 추후에 Class에 변경 사항이 발생하면 다시 자동으로 또 다른 SerialVersionUID를 생성하게 되므로 
	 * 이전에 출력했던 SerialVersionUID와 불일치하여 읽어 올 때 역직렬화에 실패하는 상황(InvaildClassException)이 생길 수 있다.
	 * 따라서 명시적으로 작성해 두는 것이 좋다.
	 * */
	private static final long serialVersionUID = 4230842096101893128L;
	private String id;
	private String pwd;
	private int age;
	private char gender;
	/* 직렬화 대상에서 제외하고 싶은 필드의 경우 transient 키워드를 이용할 수 있다. */
	private transient double point;
	
	public MemberDTO() {}

	public MemberDTO(String id, String pwd, int age, char gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", age=" + age + ", gender=" + gender + "]";
	}

}
