package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final ModelMapper mapper;
    private final CustomerRepository repository;

    @Override
    public List<Customer> getall() {
        List<Customer> customerArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            customerArrayList.add(mapper.map(entity, Customer.class));
        });
        return customerArrayList;
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public Customer searchCustomerById(Integer id) {
        return mapper.map(repository.findById(id), Customer.class);

    }

    @Override
    public void deleteCustomerById(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateCustomerById(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }
}
