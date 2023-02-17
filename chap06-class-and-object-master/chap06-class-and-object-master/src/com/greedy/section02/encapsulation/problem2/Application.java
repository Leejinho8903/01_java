package com.greedy.section02.encapsulation.problem2;

public class Application {

	public static void main(String[] args) {
		
		/* 필드에 직접 접근할 시 발생하는 문제점 2
		 * name -> kinds로 필드를 변경했기 때문에 직접 name 필드에 접근하는 코드는 모두 컴파일 에러를 발생시킨다.
		 * 즉, Monster 클래스의 일부를 수정했지만 사용하는 곳에서는 전부 함께 수정해야 하는 부담이 생긴다.
		 * 이는 유지보수에 악영향을 미치게 된다. */
		
//		Monster monster = new Monster();
//		monster.name = "드라큘라";
//		monster.hp = 200;
//		
//		System.out.println("monster name : " + monster.name);
//		System.out.println("monster hp : " + monster.hp);
		
	}

}
