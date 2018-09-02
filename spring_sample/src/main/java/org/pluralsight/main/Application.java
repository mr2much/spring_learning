package org.pluralsight.main;

import org.pluralsight.model.Customer;
import org.pluralsight.service.CustomerService;
import org.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		
		for (Customer customer : service.findAll()) {
			System.out.println(customer.toString());
		}
	}

}
