package com.example.jpa_library.service;

import com.example.jpa_library.dao.ProductRepo;
import com.example.jpa_library.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product createProduct(Product product){
        return productRepo.save(product);
    }

    public Product upadetProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> findAllProduct(){
        return productRepo.findAll();
    }

    public Optional<Product> findProductById(UUID id){
        return productRepo.findById(id);
    }

    public void deleteProduct(Product product){
        productRepo.delete(product);
    }

    public void deleteProductById(UUID id){
        productRepo.findById(id);
    }

}
