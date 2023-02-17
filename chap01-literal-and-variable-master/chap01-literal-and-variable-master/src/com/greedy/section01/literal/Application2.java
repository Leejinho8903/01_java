package com.greedy.section01.literal;

public class Application2 {

	public static void main(String[] args) {
		/* 값을 직접 연산하여 출력할 수 있다. */
		/* 이 때, 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다. */
		
		/* 1. 숫자와 숫자의 연산 */
		/* 1-1. 정수와 정수의 연산 */
		/* 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산(mod)을 사용할 수 있다. */
		System.out.println("========== 정수와 정수의 연산 ==========");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);
		
		/* 1-2. 실수와 실수의 연산 */
		/* 실수끼리의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산(mod)을 사용할 수 있다. */
		System.out.println("========== 실수와 실수의 연산 ==========");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);		//약간의 오차가 생긴다
		
		/* 1-3. 정수와 실수의 연산 */
		/* 정수와 실수의 연산도 수학에서 사용하는 사칙 연산에 나머지를 구하는 연산(mod)을 사용할 수 있다. */
		/* 정수와 실수 연산의 결과는 항상 실수가 나온다. */
		System.out.println("========== 정수와 실수의 연산 ==========");
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
		/* 2. 문자의 연산 */
		/* 2-1. 문자와 문자의 연산 */
		/* 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다. */
		System.out.println("========== 문자와 문자의 연산 ==========");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		
		/* 2-2. 문자와 정수의 연산 */
		/* 문자에 정수를 연산하는 것도 가능하다. */
		/* 문자 'a'는 숫자 97과 같다는 것을 확인할 수 있다. */
		/* 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기 때문에, 모든 문자에 대응되는 숫자들이 매칭되어 있다. (아스키코드표 참조) */
		System.out.println("========== 문자와 정수의 연산 ==========");
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 2);
		System.out.println('a' / 2);
		System.out.println('a' % 2);
		
		/* 2-3. 문자와 실수의 연산 */
		/* 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능하다. */
		/* 단, 결과는 실수 형태로 나오게 된다. */
		System.out.println("========== 문자와 실수의 연산 ==========");
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		
		/* 3. 문자열의 연산 */
		/* 3-1. 문자열과 문자열의 연산 */
		/* 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(이어 붙이기)가 된다. */
		/* 문자열은 '+' 연산 외에 다른 연산을 사용하지 못한다. */
		System.out.println("========== 문자열과 문자열의 연산 ==========");
		System.out.println("hello" + "world");
		//System.out.println("hello" - "world");
		//System.out.println("hello" * "world");
		//System.out.println("hello" / "world");
		//System.out.println("hello" % "world");

		/* 3-2. 문자열과 다른 형태의 값 연산 */
		/* 문자열과의 연산은 '+' 연산만 가능하다. */
		/* 연산 결과는 다른 형태의 값들도 문자열로 취급하여 문자열 합치기(이어 붙이기) 결과가 나오게 된다. */
		System.out.println("========== 문자열과 다른 형태의 값 연산 ==========");
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		System.out.println("123" + "456");	// 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는 것에 주의
		
		/* 4. 논리값 연산 */
		/* 4-1. 논리값과 논리값 연산 */
		/* 논리 값끼리의 연산은 모든 연산자 사용이 불가능하다. */
		//System.out.println(true + false);
		//System.out.println(true - false);
		//System.out.println(true * false);
		//System.out.println(true / false);
		//System.out.println(true % false);
		
		/* 논리값과 정수, 실수, 문자는 모든 연산자 사용이 불가능하다. */
		
		/* 4-2. 논리값과 문자열의 연산 */
		/* 논리값과 문자열의 연산은 '+' 연산자만 사용 가능하다. */
		/* 이유는, 위에서 테스트 해 본 문자열 합치기가 되는 원리와 동일하다. */
		System.out.println("========== 논리와 문자열의 연산 ==========");
		System.out.println(true + "a");
	
	}

}
