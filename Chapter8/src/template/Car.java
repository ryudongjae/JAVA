package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
		
	}
	
	public void washCar() {
		System.out.println();
	}
	final public void run() {    //final은 재정의 할수없는 메서드이다.
		
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
//final변수 값이 변경될 수 없는 상수이다 ( 대부분 static을 상요한다)
}
