package org.example.service;

import org.example.dto.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getall();

    void addCustomer(Customer customer);

    Customer searchCustomerById(Integer id);

    void deleteCustomerById(Integer id);

    void updateCustomerById(Customer customer);
}
