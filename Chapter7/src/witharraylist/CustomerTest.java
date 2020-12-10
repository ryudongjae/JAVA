package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList =new ArrayList<Customer>();
		
		
		Customer customerLee = new Customer(10010,"이무개");
		Customer customerKim = new Customer(10020,"김선호");
		Customer customerHan = new GOLDCustomer(10030,"한나라");
		Customer customerBae = new VIpCustomer(10040,"배경박",20130);
		Customer customerRyu = new GOLDCustomer(10500,"류승룡");
		
		
		customerList.add(customerBae);
		customerList.add(customerRyu);
		customerList.add(customerHan);
		customerList.add(customerKim);
		customerList.add(customerLee);
		
		
		System.out.println("=========고객정보출력=======");
		
		
		for (Customer customer :customerList) {
			System.out.println(customer.showCustomerInfo());
			System.out.println();
		}
		
		
		System.out.println("=========할인율과 보너스 계산==========");
		
		
		int price =10000;
		for (Customer customer: customerList) {
			int cost =customer.calcPrice(price);
			System.out.println(customer.showCustomerInfo()+ "님이 "+ cost + "원을 지불하셨습니다. ");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+ customer.bonusPoint+"점 입니다.");
			System.out.println();
		}
		}

}
