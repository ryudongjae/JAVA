package template;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("==========================");
		
		Car menualCar = new MenualCar();
		menualCar.run();
	}

}
