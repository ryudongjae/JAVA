package game;

public class Beginner extends Character {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모름.");
	}
	@Override
	public void turn() {
		System.out.println("turn할 줄 모름.");
	}
}
