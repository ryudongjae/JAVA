package chapter8;

public class Genesis extends Car{
	
	@Override
	public void start() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println("Genesis �޸��ϴ�.");		
	}

	@Override
	public void stop() {
		System.out.println("Genesis ����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
}
