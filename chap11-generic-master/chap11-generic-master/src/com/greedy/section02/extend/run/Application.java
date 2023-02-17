package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;

public class Application {

	public static void main(String[] args) {
		
		/* 제네릭 클래스 작성 시 extends 키워드를 이용하면 특정 타입만 사용하도록 제한을 걸 수 있다. 
		 * 
		 * 토끼의 후손이거나 토끼인 경우에만 타입으로 사용 가능하며 그 외의 타입 지정시 컴파일 단계에서 에러를 발생시킨다.
		 * */
		
		/* Rabbit의 상위 클래스, 인터페이스인 Animal, Mammal 또는 관계가 없는 Snake 타입으로는 생성 불가능하다. */
//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//		RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
//		RabbitFarm<Snake> farm1 = new RabbitFarm<>();
		
		/* Rabbit 타입이나 Rabbit의 후손으로는 인스턴스 생성이 가능하다. */
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
		
		/* 제네릭을 사용해서 올바른 타입을 타입 변수로 지정하는 경우에는
		 * 인스턴스 내부에 있는 타입 자체가 Rabbit 타입을 가지고 있는 것이 보장 되어 있기 때문에 형변환이 생략 된다. */
		farm1.setAniaml(new Rabbit());
		//((Rabbit)farm1.getAnimal()).cry();	//이와 같은 형변환이 필요 없다.
		farm1.getAnimal().cry();
		
		farm2.setAniaml(new Bunny());
		farm2.getAnimal().cry();
		
		farm3.setAniaml(new DrunkenBunny());
		farm3.getAnimal().cry();
		
		
		
		
		
		
		
		
		
		
	}

}
