package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		
		Member memberLee = new Member(300,"Lee");
		Member memberHa = new Member(200,"Ha");
		Member memberLim = new Member( 150,"Lim");
		Member memberKim = new Member( 100,"Kim");
	
		
		manager.addMember(memberKim);
		manager.addMember(memberLim);
		manager.addMember(memberHa);
		manager.addMember(memberLee);
		
		
		
		manager.showAllMember();
		
		
		manager.removeMember(100);
		manager.showAllMember();
	}

}
