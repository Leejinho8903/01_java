package com.greedy.section03.dto;

public class Application {

	public static void main(String[] args) {
		
		/* 캡슐화의 원칙에 일부 어긋나기는 하지만 매번 추상화를 하지 않아도 되는 객체도 존재한다.
		 * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
		 * 모든 필드를 private로 직접 접근을 막고, 각 필드 값을 변경하거나 반환하는 메소드를 세트로 작성한다.
		 * 메소드는 설정자(setter), 접근자(getter)들로 구성된다.
		 * */
		
		MemberDTO member = new MemberDTO();
		member.setNumber(1);
		member.setName("유관순");
		member.setAge(16);
		member.setHeight(160.5);
		member.setActivated(true);
		
		System.out.println("회원번호 : " + member.getNumber());
		System.out.println("회원명 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		System.out.println("키 : " + member.getHeight());
		System.out.println("활성화 상태 : " + member.isActivated());
		
		/* 캡슐화 원칙에 따라 작성했지만 실제로는 캡슐화가 의미 없을 정도로 필드명을 그대로 사용한 설정자와 접근자로 인해
		 * 캡슐화 효과가 없다. 하지만 데이터를 주로 다루는 객체의 경우 행위를 추상화하지 않고,
		 * 미리 모든 필드에 접근 가능성을 염두에 두고 작성해두는 관례로 인해 현재도 많이 사용되고 있다.
		 * */
		
	}

}










