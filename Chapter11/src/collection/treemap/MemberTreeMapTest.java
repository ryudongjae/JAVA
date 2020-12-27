package collection.treemap;

import collection.hashmap.*;
import collection.hashmap.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberHashMap manager = new MemberHashMap();
		
		
		Member memberLee = new Member(100,"Lee");
		Member memberHa = new Member(200,"Ha");
		Member memberLim = new Member(300,"Lim");
		Member memberKim = new Member( 99,"Kim");
		
		
		
		manager.addMember(memberKim);
		manager.addMember(memberLim);
		manager.addMember(memberHa);
		manager.addMember(memberLee);
	
		
		
		manager.showAllMember();
		
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
