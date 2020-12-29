package Travel;

public class TravelCustomer {
	
	private int customerNumber;
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(int customerNumber,String name,int age,int price) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.age = age;
		this.price =price;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return customerNumber +"|"+ name +"|"+age+"|"+price;
	}
	

}
