package stream.writer;

import java.io.*;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("writer.txt");
		fw.write('A');
		char[] buf = {'B','C','D','F','E'};
		
		fw.write(buf);
		fw.write("안녕하세요");
		fw.write(buf,2,2);
		fw.close();
		
		System.out.println("end");
	}

}
