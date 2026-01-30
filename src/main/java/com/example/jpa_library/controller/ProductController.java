package com.example.jpa_library.controller;

import com.example.jpa_library.entity.Product;
import com.example.jpa_library.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/api/product")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping ("/api/product")
    public Product upadteProduct(@RequestBody Product product){
        return productService.upadetProduct(product);
    }

    @GetMapping("/api/product")
    public List<Product> findAllProduct(){
        return productService.findAllProduct();
    }

    @GetMapping("/api/product/{id}")
    public Optional<Product> findProductById(@PathVariable UUID id){
        return productService.findProductById(id);
    }

    @DeleteMapping("/api/product/{id}")
    public void deleteProductByID(@PathVariable UUID id){
        productService.deleteProductById(id);
    }

    @DeleteMapping("/api/product")
    public void deleteProduct (Product product){
        productService.deleteProduct(product);
    }









}
