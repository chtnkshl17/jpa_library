package com.example.jpa_library.service;

import com.example.jpa_library.dao.CustomerRepo;
import com.example.jpa_library.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {
    private CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer createCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public Customer updateCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerRepo.findAll();
    }

    public void deleteCustomer (Customer customer){
        customerRepo.delete(customer);
    }

    public void deleteCustomerById(UUID id){
        customerRepo.deleteById(id);
    }

    public Optional<Customer> findById(UUID id){
        return customerRepo.findById(id);
}

}
