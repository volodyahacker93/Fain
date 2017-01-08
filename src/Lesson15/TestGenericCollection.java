 
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TestGenericCollection {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer cust1 = new Customer("David","Lee");
		customers.add(cust1);
		Customer cust2 = new Customer("Ringo","Starr");
		customers.add(cust2);
		
		//Order ord1= new Order();
		//customers.add(ord1); // Compiler error
		
		// Iterate through the list customers and do something with each 
		//  element of this collection. No casting required. 
		processData(customers);
        
	}

	private static void processData(ArrayList<Customer> customers) {
		for (Customer c: customers){
			c.doSomething();
		}
	}
	
/*	
	private static void processData(ArrayList<? extends Data> data) {
		for (Data d: data){
			 d.doSomething();
		}
	}
*/
	 
}
