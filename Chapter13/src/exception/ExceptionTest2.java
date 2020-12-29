package exception;

import java.io.*;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
		
	
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	

}
