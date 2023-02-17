package com.greedy.section02.variable;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 변수를 사용하기 위한 방법
		 * 1. 변수를 준비한다. (선언한다.)
		 * 2. 변수에 값을 대입한다. (값 대입 및 초기화) 
		 * 3. 변수를 사용한다.
		 * */
		
		/* 1. 변수 선언
		 * 자료형 변수명;
		 * */
		
		/* 1-1-1. 숫자를 취급하는 자료형 */
		byte bnum;		//1byte
		short snum;		//2byte
		int inum;		//4byte
		long lnum;		//8byte
		
		float fnum;		//4byte
		double dnum;	//8byte
		
		/* 1-1-2. 문자를 취급하는 자료형 */
		char ch;		//2byte
		
		/* 1-1-3. 논리 값을 취급하는 자료형 */
		boolean isTrue;	//1byte
		
		/* 이상 8가지를 기본 자료형이라고 한다.
		 * 앞에서 다뤄본 형태 중 문자열이 빠져있는데 문자열은 참조 자료형으로 나중에 깊게 다룬다. */
		
		/* 1-1-4. 문자열을 취급하는 자료형 */
		String str;
		
		/* 2. 변수에 값을 대입한다. (값 대입 및 초기화) 
		 * 위에서 한 변수 선언은 메모리에 값을 저장하기 위해 공간만 생성해 둔 상태이다.
		 * 그 공간에 대입 연산자를 이용하여 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
		 * 만약, 약속과 다른 형태의 값을 저장하려고 하면 Compiler는 에러를 발생시킨다.
		 * */
		
		/* 2-1. 정수를 취급하는 자료형에 값 대입 */
		bnum = 1;
		snum = 2;
		inum = 4;
		//lnum = 8;	//아무 문제가 없는 거 같지만 사실 뒤에 대문자 L을 붙여야 한다. 이유는 형변환에서 다룬다.
		lnum = 8L;	//소문자 'l'도 가능하지만 글꼴에 따라 숫자 1과 혼선이 있을 수 있어 대문자가 권장된다.
		
		/* 2-2. 실수를 취급하는 자료형에 값 대입 */
		//fnum = 4.0;
		fnum = 4.0f;	//실수 뒤에 'f'를 붙여야 한다. 대문자 'F'도 가능하지만 소문자가 권장된다.
		dnum = 8.0;
		
		/* 2-3. 문자를 취급하는 자료형에 값 대입 */
		ch = 'a';
		ch = 97;	// 'a'는 97이라는 숫자 값을 가지므로 숫자로도 char에 저장 가능하다.
		
		/* 2-4. 논리를 취급하는 자료형에 값 대입 */
		isTrue = true;
		isTrue = false;	//true 또는 false 중 한 가지 값만 사용 가능하다.
		
		/* 2-5. 문자열을 취급하는 자료형에 값 대입 */
		str = "a";
		
		/* 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하고
		 * 정수형은 int, 실수형은 double이 대표 자료형이다.
		 * 정수의 경우 일반적으로 사용되는 숫자 범위는 byte, short로 표현 불가한 경우가 많아
		 * 특수한 경우가 아니면 잘 사용하지 않는다.
		 * 실수의 경우 정확도를 기준으로 4byte 자료형보다 8byte 자료형이 더 정확한 실수를 표현할 수 있기 때문에
		 * double을 대표 자료형으로 사용하고 float를 특수한 목적이 있는 경우에만 사용한다.
		 * */
		
		/* 위의 코드 처럼 변수 선언 후 최초로 값이 대입 되는 것을 초기화라고 한다.
		 * 변수 선언과 값 대입을 동시에 수행할 수도 있다. (선언과 동시에 초기화) 
		 * */
		int point = 100;
		int bonus = 10;
		
		/* 3. 변수를 사용한다. */
		/* 3-1. 변수에 저장한 값 출력하기 */
		System.out.println("===== 변수에 저장 된 값 출력 =====");
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		/* 3-2. 변수를 이용해서 연산하기 */
		System.out.println("포인트와 보너스의 값은? " + (point + bonus));
		
		/* 3-3. 대입 연산자의 왼쪽과 오른쪽에 사용 
		 * 대입 연산자의 왼쪽은 공간이라는 의미, 오른쪽은 값이라는 의미 */
		point = point + 100;
		System.out.println("point = point + 100 ? " + point);
		
		
	}

}
