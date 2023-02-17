package com.greedy.section02.encapsulation.problem3;

public class Application {

	public static void main(String[] args) {
		
		/* 앞서 확인한 두가지 문제점을 해결해보자. 
		 * 필드에 직접 접근하지 않고 메소드를 이용하여 간접 접근하면
		 * 올바르지 않은 범위의 값으로 변경 되는 것도 막을 수 있고
		 * 필드 값의 변경이 발생하더라도 사용자는 코드를 변경하지 않아도 된다.
		 * */
		
		Monster monster = new Monster();
		monster.setInfo("프랑켄슈타인");
		monster.setHp(-100);
		System.out.println(monster.getInfo());
		
		/* 아직 Monster 클래스에 직접 접근을 막아놓지 않아 가능한 상태이다. */
		monster.hp = -100;
		System.out.println(monster.getInfo());
	}

}








