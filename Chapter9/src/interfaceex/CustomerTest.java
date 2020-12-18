package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayhello();
		
		
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		

		
		
		
	}

}
