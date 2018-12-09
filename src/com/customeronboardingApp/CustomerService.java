package com.customeronboardingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerService {
	
	CustomerDao customerDao;

	public CustomerService() {
		customerDao = CustomerDao.instance;
	}

	public void createCustomer(Customer customer) {
		customerDao.getCustomers().put(customer.getId(), customer);
	}

	public Customer getCustomer(String id) {
		return customerDao.getCustomers().get(id);
	}

	public Map<String, Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	public List<Customer> getCustomerAsList() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.addAll(customerDao.getCustomers().values());
		return customerList;
	}

	public int getCustomersCount() {
		return customerDao.getCustomers().size();
	}

	public void deleteCustomer(String id) {
		customerDao.getCustomers().remove(id);
	}

}
