package com.luv2code.springdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
	
	private List<Customer> customers;
	 
    public CustomerList() {
        customers = new ArrayList<>();
    }

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
