package com.example.jpa_library.service;

import com.example.jpa_library.dao.OrderRepo;
import com.example.jpa_library.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {
    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order createOrder(Order order){
        return orderRepo.save(order);
    }

    public Order upadteOrder(Order order){
        return orderRepo.save(order);
    }

    public List<Order> findAllOrders(){
        return orderRepo.findAll();
    }

    public Optional<Order> findOrderById(UUID id){
        return orderRepo.findById(id);
    }

    public void deleteOrder(Order order){
        orderRepo.delete(order);
    }

    public void deleteOrderById(UUID id){
        orderRepo.deleteById(id);
    }
}
