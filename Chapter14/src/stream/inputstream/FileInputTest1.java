package stream.inputstream;

import java.io.*;

public class FileInputTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input2.txt");
			
			int i ;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println((char)i);
		    i =fis.read();
			System.out.println((char)i);
			i =fis.read();
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
	}

}
