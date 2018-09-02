package org.pluralsight.service;

import java.util.List;

import org.pluralsight.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}