package collection.treeset;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String>treeSet = new TreeSet<String>(); 
		treeSet.add("kim");
		treeSet.add("Lee");
		treeSet.add("Ha");
		treeSet.add("Rim");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		
	}

}
