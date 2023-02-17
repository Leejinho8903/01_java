package com.greedy.section01.init;

public class Application {

	public static void main(String[] args) {
		
		/* 자동차 5대 인스턴스를 생성 */
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 450);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		/* 객체 배열은 레퍼런스 변수에 대한 배열이다.
		 * 생성한 인스턴스도 배열을 이용해서 관리하면 동일한 타입의 여러 개 인스턴스를 연속 처리 할 수 있어 편리하다.
		 * 또한 반환값은 1개의 값만 반환할 수 있어 동일한 타입의 여러 인스턴스를 반환해야 하는 경우도 객체 배열을 이용할 수 있다.
		 * */
		Car[] carArray = new Car[5];
		/* --------------------------------------------- */
		System.out.println(carArray);
		System.out.println(carArray[0]);
		//carArray[0].driveMaxSpeed();  
		//carArray[0]은 아직 Car 객체를 참조하지 않는 상태로 null 값이다.
		//null 값을 가지는 레퍼런스 변수를 대상으로 참조 연산자를 사용하면 java.lang.NullPointerException이 발생한다.
		/* ---------------------------------------------- */
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포터", 450);
		
		/* 배열이므로 반복문을 사용할 수 있다. */
		for(int i = 0; i < carArray.length; i++) {
			carArray[i].driveMaxSpeed();
		}
		
		/* --------------------------------------- */
		double[] darr = {0.1, 0.2, 0.3};
		for(double num : darr) {
			System.out.println(num);
		}
		/* --------------------------------------- */
		
		/* 향상 된 for문도 사용 가능하다. */
		for(Car car : carArray) {
			car.driveMaxSpeed();
		}
		
		/* 객체 배열도 할당과 동시에 초기화 할 수 있다. */
		Car[] carArray2 = {
				new Car("페라리", 300),
				new Car("람보르기니", 350),
				new Car("롤스로이스", 250),
				new Car("부가티베이론", 400),
				new Car("포터", 500)
		};
		
	}

}
