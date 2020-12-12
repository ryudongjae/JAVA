package abstractex;

public class Desktop extends Computer{
	
	public void display() {
		System.out.println("Desktop display");
		
	}
	
	public void typing() {
		
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOff() {
		
		System.out.println("display turn off");
		
		
	}
	
	
	

}
