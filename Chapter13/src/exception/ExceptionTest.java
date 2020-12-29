package exception;

import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		}finally {
			try {
			fis.close();
			System.out.println("finally");
			}catch (Exception e){
				System.out.println(e);
			}
	
		}
		System.out.println("end");
	}
	
	

}
