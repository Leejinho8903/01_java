package com.greedy.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		/* FileOutputStream : 프로그램의 데이터를 파일로 1바이트씩 내보내는 출력 스트림 */
		
		FileOutputStream fos = null;
		
		try {
			/* FileNotFoundException을 핸들링 해야 하는 것은 입력 스트림과 동일하지만 파일이 없는 상태에서 실행해도
			 * 예외가 발생하지 않고 인스턴스가 잘 생성된다.
			 * 출력 스트림의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다. 
			 * FileNotFoundException이 핸들링 하는 부분은 경로이다. 존재하지 않는 경로까지 만들어주지는 않는다. */
			
			/* 생성자의 두 번째 인자로 true를 전달하면 파일에 이어쓰기가 된다.
			 * 전달하지 않으면(or false 전달) 파일에 덮어쓰기가 된다. */
			fos = new FileOutputStream("src/com/greedy/section02/stream/testOutputStream.txt", true);
			
			/* write 메소드는 IOException 핸들링해야 한다. */
			fos.write(97);
			
			/* byte 배열을 이용해서 한 번에 기록할 수도 있다. (10 : 개행문자) */
			byte[] bar = new byte[] {98, 99, 100, 101, 102, 10, 103, 104, 105};
			fos.write(bar);
			
			/* bar 배열의 1번 인덱스부터 3의 길이만큼 파일에 내보내기 */
			fos.write(bar, 1, 3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
