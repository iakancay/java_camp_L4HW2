package java_campD4_HW2;

import java.util.Date;

import Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
	
		Customer customer1=new Customer(1,"ibrahim","akanay","2551000000", new Date(1987,13,07));
		
		Customer customer2=new Customer(2,"emrah","þenses","39000000", new Date(1991,12,13));
		baseCustomerManager.save(customer2);

	}

}
