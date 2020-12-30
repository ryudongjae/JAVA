package outputstream;

import java.io.*;

public class FileOutputTest {

	public static void main(String[] args) {
	
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			System.out.println(e);
		}
	
	}

}
