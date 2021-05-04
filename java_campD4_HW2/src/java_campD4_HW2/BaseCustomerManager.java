package java_campD4_HW2;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" added database.");
		
	}
	
}
