package com.customeronboardingApp;

import java.util.HashMap;

import java.util.Map; 
public enum CustomerDao {
	instance;

	private Map<String, Customer> customers = new HashMap<String, Customer>();

	private CustomerDao() {

		// pumping-in some default data
		Customer customer = new Customer("1", "Saurabh", "Engineer");
		customers.put("1", customer);

		customer = new Customer("2", "Mayank", "Teacher");
		customers.put("2", customer);

		customer = new Customer("3", "Gaurav", "Doctor");
		customers.put("3", customer);
	}

	public Map<String, Customer> getCustomers() {
		return customers;
	}

}
