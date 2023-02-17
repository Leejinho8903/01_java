package com.greedy.section01.thread;

public class Car extends Thread {
	
	@Override
	public void run() {
		/* Car thread로 수행할 작업 내용 작성 */
		for(int i = 0; i < 1000; i++) {
			System.out.println("Car driving...");
			try {
				/* 스레드를 지연시키는 메소드 */
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
