package com.greedy.section05.overloading;

public class OverloadingTest {
	
	/* 생성자 작성 시 매개변수의 타입, 개수, 순서를 다르게 작성하면 서로 다른 생성자로 인식해서
	 * 동일한 이름이지만 여러 개를 작성할 수 있었다. => 오버로딩(Overloading)
	 * 
	 * 오버로딩 사용 이유
	 * 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기 어려워진다.
	 * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로 관리하기 위해 사용한다.
	 * EX) System.out.println() 메소드는 모든 데이터 타입에 대해 출력할 수 있도록 메소드가 오버로딩 되어 있다.
	 * 
	 * 오버로딩의 조건
	 * 메소드의 시그니처(signature)가 다르면 다른 메소드로 인식한다. 
	 * 파라미터 선언부가 다르게 작성 되어야 하며 접근제한자나 반환형은 오버로딩 성립 요건에 해당하지 않는다.
	 * */
	
	public void test() {}
	
	/* 메소드 시그니처가 동일한 경우 컴파일 에러 발생 */
//	public void test() {}
	
	/* 접근제한자에 따른 오버로딩 성립 확인 -> 접근 제한자는 메소드 시그니처에 해당하지 않음 */
//	private void test() {}
	
	/* 반환형에 따른 오버로딩 성립 확인 -> 반환형은 메소드 시그니처에 해당하지 않음 */
//	public int test() { return 0; }
	
	/* 매개변수 유무에 따른 오버로딩 성립 확인 -> 파라미터 선언부는 메소드 시그니처에 해당한다. */
	public void test(int num) {}
	
	/* 매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다. */
	//public void test(int num2) {}
	
	/* 매개변수 갯수에 따른 오버로딩 성립 확인 */
	public void test(int num1, int num2) {}
	
	/* 매개변수 타입 변화에 따른 오버로딩 성립 확인 */
	public void test(int num, String str) {}
	
	/* 매개변수 순서 변화에 따른 오버로딩 성립 확인 */
	public void test(String str, int num) {}
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println(1);
		System.out.println(1.0);
		System.out.println('a');
		System.out.println("A");
		
	}

}
