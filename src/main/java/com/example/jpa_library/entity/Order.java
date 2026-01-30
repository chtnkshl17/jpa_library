package com.example.jpa_library.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Instant orderDate = Instant.now();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
