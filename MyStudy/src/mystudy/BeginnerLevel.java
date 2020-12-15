package mystudy;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println(" 천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump는 못함.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn은 못함. ");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******초급자 레벨입니다.******");
		
	}

	@Override
	public void flying() {
		System.out.println("날지 못합니다.");
	}

}
