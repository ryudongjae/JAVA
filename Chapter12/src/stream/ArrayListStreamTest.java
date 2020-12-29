package stream;

import java.util.*;
import java.util.stream.*;
public class ArrayListStreamTest {

	public static void main(String[] args) {
		 
		List<String> sList = new ArrayList<String>();
		sList.add("Kim");
		sList.add("Rim");
		sList.add("HA");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
		System.out.println();
		sList.stream().map(s ->s.length()).forEach(n -> System.out.println(n));
	}

}
