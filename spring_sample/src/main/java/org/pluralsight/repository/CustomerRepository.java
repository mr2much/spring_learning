package org.pluralsight.repository;

import java.util.List;

import org.pluralsight.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}