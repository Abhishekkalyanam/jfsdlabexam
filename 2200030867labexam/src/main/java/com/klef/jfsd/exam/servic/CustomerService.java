package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
