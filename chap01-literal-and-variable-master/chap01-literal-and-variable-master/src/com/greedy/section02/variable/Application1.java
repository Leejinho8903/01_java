package com.greedy.section02.variable;

public class Application1 {

	public static void main(String[] args) {
		
		/* 변수의 사용 목적 */
		
		/* 1. 값에 의미를 부여하기 위한 목적 */
		System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");
		int salary = 1000000;
		int bonus = 200000;
		System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");
		/* 변수를 사용하면 어느 값이 급여인지, 보너스 금액인지 명확하게 알 수 있다. */
	
		/* 2. 한 번 저장해둔 값을 재사용하기 위한 목적 */
		System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");

		/* 위 코드에서 공통적으로 사용 된 100이라고 하는 값을 변수에 넣고 변수를 호출하여 코드를 개선해보자. */
		int point = 200;
		System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		
		/* 지급해야 하는 포인트가 변경 된다면 위의 코드는 10줄을 변경해야 하지만 아래 코드는 변수에 대입한 값만 변경하면 적용이 된다. */
		
		/* 3. 시간에 따라서 변하는 값을 저장하고 사용할 수 있다. */
		int sum = 0;
		
		sum = sum + 10;
		System.out.println("sum에 10을 더하면 현재 sum의 값은?" + sum);
		
		sum = sum + 10;
		System.out.println("sum에 10을 더하면 현재 sum의 값은?" + sum);
		
		sum = sum + 10;
		System.out.println("sum에 10을 더하면 현재 sum의 값은?" + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
