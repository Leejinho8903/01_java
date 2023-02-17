package com.greedy.section02.encapsulation.problem1;

public class Application {

	public static void main(String[] args) {
		
		/* 필드에 직접 접근할 때 생길 수 있는 문제점 1
		 * => 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다.
		 * */
		
		/* 1번 몬스터 생성 */
		Monster monster1 = new Monster();
		/* 몬스터의 이름과 체력 변경 */
		monster1.name = "두치";
		monster1.hp = 200;
		/* 몬스터 정보 출력 */
		System.out.println("monster1 name : " + monster1.name);
		System.out.println("monster1 hp : " + monster1.hp);
		
		/* 2번 몬스터 생성 */
		Monster monster2 = new Monster();
		/* 몬스터의 이름과 체력 변경 */
		monster2.name = "뿌꾸";
		monster2.hp = -200;
		/* 몬스터 정보 출력 */
		System.out.println("monster2 name : " + monster2.name);
		System.out.println("monster2 hp : " + monster2.hp);
		
		/* --------------------- setHp() ------------------------ */
		
		/* 잘못 된 값을 검증하여 필드 값을 수정하는 메소드를 작성하여 위에서 발생한 문제를 해결하였다. */
		
		/* 3번 몬스터 생성 */
		Monster monster3 = new Monster();
		/* 몬스터의 이름과 체력 변경 */
		monster3.name = "프랑켄슈타인";
		monster3.setHp(-100);
		/* 몬스터 정보 출력 */
		System.out.println("monster3 name : " + monster3.name);
		System.out.println("monster3 hp : " + monster3.hp);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
