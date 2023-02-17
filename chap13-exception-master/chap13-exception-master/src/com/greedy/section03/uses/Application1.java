package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		/* 예외 처리를 가장 많이 활용해야 하는 것이 IO(input/output) 패키지이다. 
		 * 아직 IO를 배우지 않았지만 IO 문법보다 try-catch 블럭의 실제 사용과 흐름에 집중해서 살펴보자. 
		 * */
		
		/* finally 블럭에서 사용하려면 레퍼런스 변수를 try 블럭 밖에서 선언해야 한다. */
		BufferedReader in = null;
		
		try {
			/* FileReader라는 클래스의 생성자에 예외를 throws 해 놓았다.
			 * 사용하는 쪽에서 반드시 예외처리를 해야하기 때문에 try-catch 블럭 안에서
			 * 생성자를 호출하여 인스턴스를 생성해야 한다. */
			in = new BufferedReader(new FileReader("test.dat"));
			
			String s;
			
			/* readLine() 메소드도 IOException을 throws 하므로 catch 블럭을 추가해서 예외 처리 구문을 작성해야 한다. */
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			
			
		} catch (FileNotFoundException | EOFException e) {	//FileNotFoundException : 해당 파일을 찾지 못한 예외
			/* FileNotFoundException과 EOFException을 동시에 처리할 수 있다. (multi-catch) 
			 * 같은 레벨의 자손을 한 번에 처리할 수 있다. */
			e.printStackTrace();
		} catch (IOException e) {
			//IOException 입출력에 관해 추상화 된 예외로 FileNotFoundException은 IOException의 후손이다.
			//catch 블럭은 여러 개를 작성할 시 상위 타입이 하단에 오고 후손 타입이 먼저 작성되어야 한다.
			//상위 타입이 위에 오면 다형성 적용에 의해 아래 catch 블럭까지 도달하지 못한다.
			e.printStackTrace();
		} finally {
			
			/* 예외 처리 구문과 상관 없이 반드시 수행해야 하는 경우 작성하며 보통 사용한 자원을 반납할 목적으로 사용하게 된다. */
			try {
				/* 입출력에 사용한 스트림을 닫아주는 메소드이다.
				 * IOException을 위임한 메소드이기 때문에 finally 블럭 안이더라도 예외처리를 중첩으로 해주어야 한다. */
				
				/* NullPointerException은 unchecked exception이므로 보통 if 구문으로 해결 가능하다. */
				if(in != null) 
					in.close();	
					
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
