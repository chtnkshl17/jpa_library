package com.example.jpa_library.controller;

import com.example.jpa_library.entity.Customer;
import com.example.jpa_library.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/api/customer")
    public Customer craeteCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @PutMapping("/api/customer")
    public Customer updateCustomer (@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/api/customer")
    public List<Customer> findAllCustomer(){
        return customerService.findAllCustomer();
    }

    @DeleteMapping("/api/customer")
    public void deleteCustomer (Customer customer){
        customerService.deleteCustomer(customer);
    }

    @DeleteMapping("/api/customer/{id}")
    public void deleteCustomerById(@PathVariable UUID id){
        customerService.deleteCustomerById(id);
    }
}
