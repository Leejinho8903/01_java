package com.greedy.section01.extend;

public class Car {
	
	/* 자동차의 달리는 상태를 확인할 수 있는 필드 */
	private boolean runningStatus;
	
	/* 기본 생성자 */
	public Car() {
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}
	
	/* 자동차의 기본적인 달리는 기능 */
	public void run() {
		runningStatus = true;
		System.out.println("자동차가 달립니다.");
	}
	
	/* 자동차의 기본적인 멈추는 기능 */
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈춥니다.");
	}
	
	/* 자동차의 기본적인 경적을 울리는 기능 */
	public void soundHorn() {
		
		/* 주행 중인 상태에만 기능을 수행할 수 있다. */
		if(isRunning()) {
			System.out.println("빵!빵!");
		} else {
			System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
		}
		
	}
	
//	private boolean isRunning() {
	protected boolean isRunning() {
		/* 자동차의 주행 중 상태를 반환하는 기능을 수행 */
		return runningStatus;
	}
	
	
	
	
	
	
	
	
	
	
	

}
