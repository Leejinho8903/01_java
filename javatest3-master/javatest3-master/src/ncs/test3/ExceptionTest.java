package ncs.test3;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.print("정수 값 입력(2~5 사이의 값만 입력) : ");
		int data = sc.nextInt();
		
		try {
			System.out.println("결과 값 : " + cal.getSum(data));
		} catch (InvaildException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
