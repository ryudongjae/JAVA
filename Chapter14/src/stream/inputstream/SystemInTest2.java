package stream.inputstream;

import java.io.*;

public class SystemInTest2 {

	public static void main(String[] args) {
			
		System.out.println("입력:");
		
		try {
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
