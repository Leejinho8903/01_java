package com.greedy.section03.abstraction;

public class Car {
	
	/* 시동을 켜거나 끄거나, 앞으로 가거나 멈추거나 하는 행동은 시동이 걸려있는지의 상태를 확인해야 한다.
	 * 즉, 메소드간에 서로 공유해야 하는 속성이 존재한다.
	 * 그 속성을 필드에 작성한다.
	 * */
	private boolean isOn;		//초기에는 시동이 꺼진 false 상태
	private int speed;			//초기에는 속도 0

	public void startUp() {
		/* 시동 걸기 - 시동이 걸려있는 상태인 경우에는 할 일이 없고, 시동이 걸려있지 않은 경우에만 시동을 건다. */
		if(isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
		} else {
			isOn = true;
			System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료 되었습니다.");
		}
	}
	
	public void go() {
		if(isOn) {
			/* 가속을 할 때마다 속도를 10km/h씩 증가시킨다 */
			System.out.println("차가 앞으로 움직입니다.");
			speed += 10;
			System.out.println("현재 차의 시속은 " + speed + "km/h 입니다.");
		} else {
			System.out.println("차의 시동이 걸려있지 않았습니다. 시동을 먼저 걸어주세요.");
		}
	}
	
	public void stop() {
		if(isOn) {
			if(speed > 0) {
				speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
			} else {
				System.out.println("차는 이미 멈춰있는 상태입니다.");
			}
		} else {
			System.out.println("차의 시동이 걸려있지 않았습니다. 시동을 먼저 걸어주세요.");
		}
	}
	
	public void turnOff() {
		if(isOn) {
			if(speed > 0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");
			} else {
				isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.");
			}
		} else {
			System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
