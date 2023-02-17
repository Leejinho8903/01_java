package com.greedy.section02.encapsulation.problem1;

public class Monster {
	
	/* 필드로 몬스터 이름과 체력을 저장할 공간을 선언 */
	String name;
	int hp;
	
	/* hp에 음수가 저장 되는 것을 방지하고자 hp가 양수인 경우에만 반영하고
	 * 0보다 작은 경우 0으로 변경할 수 있도록 하는 기능을 작성한다. => 메소드를 작성한다.
	 * */
	public void setHp(int hp) {
		if(hp > 0) {
			System.out.println("양수 값이 입력 되어 몬스터의 체력을 입력한 값으로 변경합니다.");
			/* this는 인스턴스가 생성 되었을 때 자신의 주소를 저장하는 레퍼런스 변수
			 * 지역변수와 전역변수의 이름이 동일한 경우 지역 변수에 우선적으로 접근하기 때문에 전역변수에 접근하기 위해
			 * this.를 명시했다. */
			this.hp = hp;
		} else {
			System.out.println("0보다 작거나 같은 값이 입력 되어 몬스터의 체력을 0으로 변경합니다.");
			this.hp = 0;
		}
	}

}









