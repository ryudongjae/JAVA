package stream.reader;

import java.io.*;

public class FileReaderTest2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		int i;
		while ((i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		isr.close();
	}

}
