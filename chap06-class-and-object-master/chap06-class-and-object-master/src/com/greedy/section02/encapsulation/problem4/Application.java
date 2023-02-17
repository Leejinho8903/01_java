package com.greedy.section02.encapsulation.problem4;

public class Application {
	
	public static void main(String[] args) {
		
		/* 선언한 필드대로 공간은 생성되어 있지만 직접 접근할 수 없고 public으로 접근을 허용한 메소드만 이용할 수 있도록 했다.
		 * 이를 캡슐화(encapsulation)라고 한다.
		 * => 유지보수성 증가를 위해
		 * => 클래스 작성 시 특별한 목적이 아니면 캡슐화가 기본 원칙*/
		Monster monster = new Monster();
//		monster.name = "프랑켄슈타인";
//		monster.hp = -200;
		monster.setInfo("프랑켄슈타인");
		monster.setHp(-200);
		System.out.println(monster.getInfo());
		
	}

}
