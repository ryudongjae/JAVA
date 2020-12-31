package stream.decorator;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		
		long miliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("applelogo.png");
				FileOutputStream fos = new FileOutputStream("applelogo2.png")){
			miliseconds = System.currentTimeMillis();
			
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			miliseconds = System.currentTimeMillis() - miliseconds;
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("시간: " + miliseconds);
	}

}
