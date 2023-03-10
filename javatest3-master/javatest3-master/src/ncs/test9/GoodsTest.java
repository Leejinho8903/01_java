package ncs.test9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {
		
		Goods goods = new Goods();
		// BufferedReader를 사용하여 키보드 입력스트림 객체 생성하고, 
		// 입력 처리하고 출력처리 한다.
		// try with resource 문으로 작성한다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			goods.setName(br.readLine());
			System.out.print("가격 : ");
			goods.setPrice(Integer.parseInt(br.readLine()));
			System.out.print("수량 : ");
			goods.setQuantity(Integer.parseInt(br.readLine()));
			
			System.out.println("입력된 결과는 다음과 같습니다.");
			System.out.println(goods.getName() + ", " + goods.getPrice() + " 원," + goods.getQuantity() + " 개");
			System.out.println("총 구매 가격 : " + (goods.getPrice() * goods.getQuantity()) + " 원");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
