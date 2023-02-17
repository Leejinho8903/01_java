package com.greedy.section01.extend;

public class Application {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.soundHorn();
		car.run();
		car.soundHorn();
		car.stop();
		car.soundHorn();
		
		System.out.println();
		
		/* Car를 상속 받은 FireCar 타입의 객체 생성 
		 * 상속은 부모가 가진 멤버를 사용하면서 확장까지 가능하다.
		 * 하지만 car 인스턴스로는 fireCar 인스턴스가 가진 기능을 사용할 수 없다.
		 * 자식은 부모 멤버에 접근해서 자신의 멤버처럼 사용 가능하지만, 반대의 경우는 허용하지 않는다. */
		FireCar fireCar = new FireCar();
		
		fireCar.soundHorn();
		fireCar.run();
		fireCar.soundHorn();
		fireCar.stop();
		fireCar.soundHorn();
		
		fireCar.sprayWater();
		//car.sprayWater();
		
		System.out.println();
		
		RacingCar racingCar = new RacingCar();
		racingCar.soundHorn();
		racingCar.run();
		racingCar.soundHorn();
		racingCar.stop();
		racingCar.soundHorn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
