package chapter8;

public class Grandeur extends Car{
	
	@Override
	public void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur �޸��ϴ�.");		
	}

	@Override
	public void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}

}
