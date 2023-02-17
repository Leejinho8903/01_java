package com.greedy.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/* 오버플로우
		 * 자료형 별 값의 최대 범위를 벗어나는 경우
		 * 초과한 값을 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킴
		 * */
		
		byte num1 = 127;
		System.out.println("num1 : " + num1); 	// 127 : byte의 최대 저장 범위
		
		num1++;		//1 증가
		
		System.out.println("num1 : " + num1); 	// -128 : byte의 최소 저장 단위
		
		/* 언더플로우 */
		/* 오버플로우의 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다. */
		byte num2 = -128;
		System.out.println("num2 : " + num2);	// -128 : byte의 최소 저장 단위
		
		num2--;		//1 감소
		
		System.out.println("num2 : " + num2);	// 127 : byte의 최대 저장 단위
		
		/* 오버플로우나 언더플로우는 컴파일 에러, 런타임 에러를 발생시키지 않으므로
		 * 최대값, 최소값 범위를 고려해서 코드를 작성해야 한다. */
		
		int firstNum = 1000000;
		int secondNum = 700000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("multi : " + multi);
		
		long longMulti = firstNum * secondNum;
		
		System.out.println("longMulti : " + longMulti);
		
		/* 이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 처음 결과와 차이가 없다.
		 * 그렇다면 계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제 형변환 사용) 
		 * */
		long result = (long) firstNum * secondNum;
		System.out.println("result : " + result);
		
		
		
		
		
		
		
		
		
		
	}

}
