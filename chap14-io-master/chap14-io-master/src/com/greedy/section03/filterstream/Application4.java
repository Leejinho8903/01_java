package com.greedy.section03.filterstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.greedy.section03.filterstream.dto.MemberDTO;

public class Application4 {

	public static void main(String[] args) {
		
		/* ObjectInputStream/ObjectOutputStream : 객체 단위 입출력 보조 스트림 */
		
		MemberDTO[] outputMembers = {
				new MemberDTO("user01", "pass01", 25, '여', 1250.7),
				new MemberDTO("user02", "pass02", 30, '남', 1221.5),
				new MemberDTO("user03", "pass03", 35, '여', 1234.8)
		};
		
	
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt"))) {
			
			for(int i = 0; i < outputMembers.length; i++) {
				oos.writeObject(outputMembers[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		/* 처음에 실행하면 java.io.NotSerializableException 이 발생한다. 이는 직렬화 처리를 해주지 않아서 발생하는 예외이다.
		 * 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술을
		 * 직렬화라고 한다. 반대로 바이트로 변환 된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.
		 * */
		
		MemberDTO[] inputMembers = new MemberDTO[3];
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/com/greedy/section03/filterstream/testObjectStream.txt"))) {
			
			for(int i = 0; i < inputMembers.length; i++) {
				inputMembers[i] = (MemberDTO) ois.readObject();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			//readObject()로 읽어온 Object를 역직렬화 할 수 있는 Class가 없을 때 ClassNotFoundException이 발생한다.
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		/* 파일에서 읽어온 객체 결과 출력 */
		for(MemberDTO member : inputMembers) {
			System.out.println(member);
		}
		
	}

}
