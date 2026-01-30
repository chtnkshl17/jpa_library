package com.example.jpa_library.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TABLE_CUSTOMER")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastNAme;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Order> orders;
}
