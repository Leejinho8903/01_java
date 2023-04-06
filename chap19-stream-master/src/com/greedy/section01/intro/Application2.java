package com.greedy.section01.intro;

import java.util.Arrays;
import java.util.List;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 스트림의 병렬 처리 확인 */
		List<String> stringList = Arrays.asList("java", "oracle", "jdbc", "html", "css");
		
		/* 스트림을 사용하지 않으면 모든 작업은 main 스레드에서 일어난다. */
		System.out.println("=================== foreach");
		for(String s : stringList) {
			System.out.println(s + " : " + Thread.currentThread().getName());
		}
		
		/* 일반적인 스트림도 main 스레드가 작업을 수행한다. */
		System.out.println("=================== normal stream");
		stringList.forEach(Application2::print);
		
		/* 병렬 스트림을 사용하면 병렬 처리를 손쉽게 할 수 있다. (성능상 유리함) */
		System.out.println("=================== paralle stream");
		stringList.parallelStream().forEach(Application2::print);
		stringList.parallelStream().forEach(Application2::print);
	}
	
	private static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
