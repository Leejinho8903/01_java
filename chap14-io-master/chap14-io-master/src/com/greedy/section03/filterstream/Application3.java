package com.greedy.section03.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		/* 외부 데이터로부터 읽어오는 데이터를 바이트 형으로만 읽어오면
		 * 정수, 문자, 문자열 등 여러 데이터 타입을 취급하는 경우 별도의 변환 처리를 해야한다.
		 * 따라서 데이터 자료형 별로 처리하는 기능을 추가한 보조 스트림을 제공하고 있다.
		 * DataInputStream/DataOutputStream이다.
		 * */
		
		/* 데이터형별로 파일에 기록하는 DataOutputStream 인스턴스 생성 */
		try (DataOutputStream dout = new DataOutputStream(
				new FileOutputStream("src/com/greedy/section03/filterstream/score.txt"))) {
			
			/* 파일에 자료형별로 기록 */
			dout.writeUTF("김영희");
			dout.writeInt(95);
			dout.writeChar('A');
			
			dout.writeUTF("김철수");
			dout.writeInt(87);
			dout.writeChar('B');
			
			dout.writeUTF("홍길동");
			dout.writeInt(73);
			dout.writeChar('C');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 데이터형 별로 읽어오는 DataInputStream 인스턴스 생성 */
		try (DataInputStream din = new DataInputStream(
				new FileInputStream("src/com/greedy/section03/filterstream/score.txt"))) {
			
			/* 무한 루프로 읽어들이게 되면 파일에 더 이상 읽을 것이 없을 경우 EOFException이 발생한다.
			 * (End of File Exception)
			 * catch 블럭에 EOFException을 핸들링하는 코드를 추가한다. 
			 * */
			while(true) {
				/* 파일에 기록한 순서대로 읽어들이지 않는 경우 에러가 발생하거나 올바르지 않은 값을 읽어온다. */
				System.out.println(din.readUTF());
				System.out.println(din.readInt());
				System.out.println(din.readChar());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기를 완료하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
	}

}
