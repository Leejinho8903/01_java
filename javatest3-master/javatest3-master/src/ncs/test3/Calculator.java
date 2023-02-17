package ncs.test3;

public class Calculator {
	public double getSum(int data) throws InvaildException {
		if(data >= 2 && data <= 5) {
			int sum = 0;
			for(int i = 1; i <= data; i++) {
				sum += i;
			}
			return sum;
		}else {
			throw new InvaildException("입력 값에 오류가 있습니다.");
		}
	}

}
