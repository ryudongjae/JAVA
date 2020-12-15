package game;

public abstract class CharacterTest {
	
	public static void main(String[] args) {
		
		System.out.println("******초급자 레벨입니다.******");
		
		Character beginner = new Beginner();
		beginner.play();
		
		System.out.println("******중급자 레벨입니다.******");
		
		Character intermediate = new  Intermediate();
		intermediate.play();
		
		System.out.println("******고급자 레벨입니다.******");
		
		Character advanced = new Advanced();
		advanced.play();
	}

}
