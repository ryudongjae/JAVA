package collection.treeset;

import java.util.*;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2)*(-1);
		}
	
	
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String>treeSet = new TreeSet<String>(new MyCompare()); 
		treeSet.add("kim");
		treeSet.add("Lee");
		treeSet.add("Ha");
		treeSet.add("Rim");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
	}

}

