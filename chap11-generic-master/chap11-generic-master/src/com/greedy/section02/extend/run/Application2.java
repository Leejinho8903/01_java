package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;
import com.greedy.section02.extend.WildCardFarm;

public class Application2 {

	public static void main(String[] args) {
		/* 와일드 카드(wildcard)
		 * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
		 * */
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
		/* 토끼 농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다. */
//		wildCardFarm.anyType(new RabbitFarm<Mammal>());
		
		/* 1. 매개변수의 타입 제한이 없는 경우 */
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		/* 2. <? extends Bunny> 인 경우 */
//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		/* 3. <? super Bunny> 인 경우 */
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//		wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
