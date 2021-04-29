package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ibrahim=new IndividualCustomer();
		ibrahim.customerNumber="12345";
		
		
		CorporateCustomer hepsiBurada= new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		CustomerManager customerManager= new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(ibrahim);
		//customerManager.add(abc);
		
		Customer[] customers= {ibrahim,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
	}

}
