package com.example.jpa_library.dao;

import com.example.jpa_library.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, UUID> {
}
