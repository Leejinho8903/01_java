package com.greedy.section01.array;

public class Application5 {

	public static void main(String[] args) {
		
		/* 랜덤한 카드를 한장 뽑아서 출력하는 프로그램
		 * 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만든다.
		 * */
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
		
		/* 배열 인덱스 범위의 난수 생성 */
		int randomShapeIndex = (int) (Math.random() * shapes.length);
		int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);
		
		/* index 이용해서 출력하기 */
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " 
					+ cardNumbers[randomCardNumberIndex] + "카드입니다.");
	}

}






