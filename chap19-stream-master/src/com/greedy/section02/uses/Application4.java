package com.greedy.section02.uses;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application4 {

	public static void main(String[] args) {

		/* 스트림의 최종 연산 
		 * : 중간 연산을 통해 변환 된 스트림은 마지막으로 최종 연산을 통해 각 요소를 소모하여 결과를 표시한다. 
		 *   지연 되었던 모든 중간 연산이 최종 연산 시에 수행 된다.
		 */

		/*
		 * 1. forEach() : 스트림의 모든 요소를 소모하여 지정 된 작업을 수행 보통 스트림의 모든 요소를 출력하는 용도로 많이 사용한다.
		 */
		System.out.println("===== 스트림 요소 출력 =====");
		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println();

		/* 2. reduce() : 스트림의 요소를 하나씩 줄여가며 누적 연산 수행 */
		System.out.println("===== 요소 소모 결과 출력 =====");
		IntStream stream1 = IntStream.rangeClosed(1, 100);
		int sum = stream1.reduce(0, (a, b) -> a + b); // 1~100을 더한 결과
		System.out.println(sum);

		Stream<String> stream2 = Stream.of("apple", "banana", "cat", "dog");
		/*
		 * java.util.Optional<T> 'T' 타입의 객체를 포장해주는 래퍼 클래스(Wrapper Class)로 모든 타입의 참조 변수를
		 * 저장할 수 있다.
		 */
		Optional<String> result1 = stream2.reduce((s1, s2) -> s1 + "*" + s2);

		/*
		 * Optional 래퍼 클래스는 예상하지 못한 NullPoiniterException을 회피하기 위한 메소드를 제공한다.
		 * ifPresent()는 Optional 객체가 값을 가지고 있으면 실행하고 null인 경우 실행하지 않는다.
		 */
		result1.ifPresent(System.out::println);

		/* 인수로 초기 값을 전달하는 reduce 메소드의 반환 타입은 Optional<T>가 아니라 T 타입이다. */
		Stream<String> stream3 = Stream.of("apple", "banana", "cat", "dog");
		String sum2 = stream3.reduce("start", (s1, s2) -> s1 + "*" + s2);
		System.out.println(sum2);

		// 가장 스코어가 높은 학생 찾기
		Stream<StudentDTO> stream4 = Stream.of(new StudentDTO(1, 3, "유관순", 90), new StudentDTO(2, 1, "홍길동", 80),
				new StudentDTO(3, 1, "신사임당", 85), new StudentDTO(4, 2, "장보고", 95), new StudentDTO(5, 2, "선덕여왕", 75));

		StudentDTO student = stream4.reduce((a, b) -> (a.getScore() > b.getScore()) ? a : b).get();
		System.out.println("가장 스코어가 높은 학생 : " + student);

		/*
		 * 3. count() : 요소의 개수 long 타입으로 반환 
		 * 4. sum() : 요소의 합계 반환
		 */
		IntStream stream5 = IntStream.of(99, 44, 55, 88, 77);
		System.out.println(stream5.count());

		IntStream stream6 = IntStream.of(99, 44, 55, 88, 77);
		System.out.println(stream6.sum());

	}

}
