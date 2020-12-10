package witharraylist;

public class GOLDCustomer extends Customer{
	
	double salesRatio;
	
	public GOLDCustomer (int customerID, String customerName) {
		super(customerID, customerName);
		
		
		customerGrade ="GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.05;
	}

	

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

}
