package stream.inputstream;

import java.io.*;

public class SystemInTest {

	public static void main(String[] args) {
			
		System.out.println("입력:");
		
		try {
			int i ;
			InputStreamReader isr = new InputStreamReader(System.in);
			while ((i= isr.read()) !='끝') {
				System.out.print((char)i);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
