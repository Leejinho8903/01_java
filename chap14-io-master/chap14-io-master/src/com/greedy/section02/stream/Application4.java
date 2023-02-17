package com.greedy.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

	public static void main(String[] args) {
		
		/* FileWriter : 프로그램의 데이터를 파일로 문자 단위로 내보내는 출력 스트림 */
		
		FileWriter fw = null;
		
		try {
			/* 출력 스트림의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성하나 경로가 존재하지 않는 경우는 예외가 발생한다. 
			 * 두 번째 인자로 true 전달하면 이어쓰기 된다. */
			fw = new FileWriter("src/com/greedy/section02/stream/testWriter.txt"/*, true*/);
			
			fw.write(97);
			
			/* 문자 단위 출력도 내부 버퍼를 사용하므로 쌓여있는 데이터를 flush()로 내보내줘야 최종적으로 파일에 출력된다.
			 * 또는 close()로 자원을 반납하면 반납 전에 flush() 메소드가 내부적으로 호출 되므로 파일에 출력된다. */
			//fw.flush();
			
			/* 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다. */
			fw.write('A');
			
			/* 또는 char 배열도 가능하다. */
			fw.write(new char[] {'a', 'b', 'c', 'd', 'e'});
			
			/* 또는 String도 가능하다. */
			fw.write("월요일 좋아~");
	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
