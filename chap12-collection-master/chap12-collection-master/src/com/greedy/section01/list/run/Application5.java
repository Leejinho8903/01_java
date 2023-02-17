package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

	public static void main(String[] args) {
		
		/* Queue
		 * Queue는 선형 메모리 공간에 데이터를 저장하는 선입 선출(FIFO - First Input First Out) 방식의 자료구조이다.
		 * Queue 인터페이스를 상속 받는 하위 인터페이스들은 Deque, BlockingQueue, TransferQueue 등 다양하지만
		 * 대부분의 큐는 LinkedList를 이용한다.
		 * */
		
		/* Queue 자체로는 인터페이스이기 때문에 인스턴스 생성이 불가능하다. */
//		Queue<String> que = new Queue<>();
		
		/* LinkedList로 인스턴스 생성 */
		Queue<String> que = new LinkedList<>();
		
		/* 큐에 데이터를 넣을 때에는 offer()를 사용한다. */
		que.offer("first");
		que.offer("second");
		que.offer("third");
		que.offer("fourth");
		que.offer("fifth");
		
		System.out.println(que);
		
		/* 큐에서 데이터를 꺼낼 때는 2가지 메소드가 있다.
		 * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
		 * poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거 
		 * */
		
		System.out.println("peek() : " + que.peek());
		System.out.println(que);
		
		System.out.println("poll() : " + que.poll());
		System.out.println(que);
		
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll());
		System.out.println("poll() : " + que.poll()); //반환 값이 없을 경우 null로 반환
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
