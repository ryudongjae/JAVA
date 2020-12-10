package witharraylist;

public class VIpCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	
	public VIpCustomer(int customerID,String customerName,int agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
		
		
	}

	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price -(int)(price * salesRatio);
	}
	
	
	public String showCustomerInfo() {
		
		return super.showCustomerInfo() +"담당 사원의 번호는 "+ agentID +" 입니다.";
	}
	public int AgentID() {
		return agentID;
	}

}
