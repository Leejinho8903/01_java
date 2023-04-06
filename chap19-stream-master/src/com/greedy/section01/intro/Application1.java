package com.greedy.section01.intro;

import java.util.Arrays;
import java.util.List;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 스트림(stream)은 자바 8부터 추가 된 기능으로, 컬렉션에 저장한 엘리먼트들을 하나씩 순회하면서 처리할 수 있는 기능이다.
		 * 자바 8 이전의 배열 또는 컬렉션을 다루는 방법은 'for', 'forEach'를 사용하여 엘리먼트를 꺼내서 다루는 방법이었다.
		 * 스트림을 이용하면 배열 또는 컬렉션을 함수 여러 개를 사용해서 결과를 쉽게 얻을 수 있으며
		 * 람다식과 함께 사용하면 컬렉션에 담긴 데이터 처리를 간결하게 표현할 수 있다.
		 * */
		
		List<String> stringList = Arrays.asList("hello", "world", "stream");
		
		/* 이전의 스트림을 이용하지 않던 방식 */
		for(String str : stringList) {
			System.out.println(str);
		}
		
		/* 스트림을 이용한 방식 */
		stringList.forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
