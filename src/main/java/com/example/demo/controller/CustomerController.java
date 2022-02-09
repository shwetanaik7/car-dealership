package com.example.demo.controller;

import java.util.Optional;


import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;
import com.example.demo.entity.Customer;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customer")
	Iterable<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@GetMapping("/customer/{id}")
	Optional<Customer> getCustomers(@PathVariable("id") Integer id) {
		return customerService.getcustomer(id);
	}

	@PostMapping("/customer")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void createCustomer(@RequestBody @Valid Customer customer) {
		customerService.saveCustomer(customer);
	}
}
