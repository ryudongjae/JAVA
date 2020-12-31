package stream.decorator;

import java.io.*;
import java.net.*;

public class FileCopy3 {

	public static void main(String[] args) throws IOException {
		
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
		
		Socket socket = new Socket();
		
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		isr.readLine();
		System.out.println("시간: " + miliseconds);
	}

}
