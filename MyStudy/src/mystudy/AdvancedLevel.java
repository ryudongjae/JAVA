package mystudy;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn은 못합니다. ");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******중급자 레벨입니다******");
		
	}

	@Override
	public void flying() {
		System.out.println("날지 못합니다.");
		
	}

}
