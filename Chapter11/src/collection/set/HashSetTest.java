package collection.set;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {

	
		HashSet<String> set = new HashSet<String>();
		
		set.add("kim");
		set.add("lee");
		set.add("ha");
		set.add("rim");
		
		//hashset은 중복을 허용하지 않는다.
		
		Iterator<String> ir = set.iterator();
		
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
