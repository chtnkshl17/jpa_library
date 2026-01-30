package com.example.jpa_library.controller;

import com.example.jpa_library.entity.Order;
import com.example.jpa_library.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/order")
    public Order createOrder (@RequestBody Order order){
     return orderService.createOrder(order);
    }

    @PutMapping("/api/order")
    public Order updateOrder(@RequestBody Order order){
        return orderService.upadteOrder(order);
    }

    @GetMapping("/api/order")
    public List<Order> findAllOrders(){
        return orderService.findAllOrders();
    }

    @GetMapping("/api/order/{id}")
    public Optional<Order> findOrderById(@PathVariable UUID id){
        return orderService.findOrderById(id);
    }

    @DeleteMapping("/api/order/{id}")
    public void deleteOrderById(@PathVariable UUID id){
        orderService.deleteOrderById(id);
    }

    @DeleteMapping("/api/order")
    public void deleteOrder(Order order){
        orderService.deleteOrder(order);
    }
}
