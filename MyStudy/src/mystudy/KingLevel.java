package mystudy;

public class KingLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("두바퀴 돕니다.");
	}

	@Override
	public void flying() {
		System.out.println("높게 날수있습니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******최상급자 레벨입니다.****** ");
	}

}
