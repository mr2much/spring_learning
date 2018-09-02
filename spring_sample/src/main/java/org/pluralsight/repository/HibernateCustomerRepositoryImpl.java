package org.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see org.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Anubis");
		customer.setLastname("Lockward");
		
		customers.add(customer);
		
		return customers;
	}
}
