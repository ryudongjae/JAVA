package Travel;

import java.util.*;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee =  new TravelCustomer(1001, "이상현 ", 40, 100);
		TravelCustomer customerKim =  new TravelCustomer(1002, "김주희", 20, 100);
		TravelCustomer customerKing =  new TravelCustomer(1003, "킹기훈", 13, 50);
		TravelCustomer customerRim =  new TravelCustomer(1004, "임상철", 40, 50);
		
		List<TravelCustomer>customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerKing);
		customerList.add(customerRim);
		
		System.out.println(customerList);
		
		System.out.println();
		customerList.stream().map(c ->c.getName()).forEach(s ->System.out.println(s));
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println();
		System.out.println();
		System.out.println(total);
		
		
		customerList.stream().filter(c ->c.getAge() >=20).map(c ->c.getName()).sorted().forEach(s -> System.out.println(s));
		}

}
