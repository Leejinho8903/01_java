package com.greedy.section02.encapsulation.problem3;

public class Monster {
	
	/* 필드를 name -> kinds로 변경할 경우 Monster 클래스의 내부 메소드는 변경해주어야 하지만
	 * 사용자의 호출 코드는 변경하지 않아도 된다. */
	
	//String name;
	String kinds;
	int hp;
	
	public void setInfo(String info) {
		//this.name = info;
		this.kinds = info;
	}
	
	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		} else {
			this.hp = 0;
		}
	}
	
	public String getInfo() {
//		return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
		return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
	}

}
