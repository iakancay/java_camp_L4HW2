package java_campD4_HW2;

public class StarbucksCustomerManager extends BaseCustomerManager{
CustomerCheckService customerCheckService;
 

public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}





 public void save(Customer customer) {
	 if(customerCheckService.checkIfRealPerson(customer)) {
		 super.save(customer);
		 System.out.println("validation successful..."); 
	 }
	 else {
		System.out.println("Validation failed.Please enter correct information.."); 
	 }
	 
 }

}
