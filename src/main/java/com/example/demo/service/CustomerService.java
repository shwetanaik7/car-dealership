package com.example.demo.service;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	public Optional<Customer> getcustomer(Integer id) {
		return customerRepository.findById(id);
	}

	public Iterable<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	public void saveCustomer(@Valid Customer customer) {
		customerRepository.save(customer);
	}
}
