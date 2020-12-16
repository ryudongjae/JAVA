package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println(" customer cell ");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}
	
	public void order() {
		System.out.println(" customer order ");
	}

	public void sayhello() {
		System.out.println("hello");
	}
}
