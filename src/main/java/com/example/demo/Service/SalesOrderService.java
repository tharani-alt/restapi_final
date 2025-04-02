package com.example.demo.Service;

import com.example.demo.Entity.SalesOrder;
import com.example.demo.Repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    public SalesOrder createSalesOrder(SalesOrder salesOrder) {
        return salesOrderRepository.save(salesOrder);
    }

    public List<SalesOrder> getAllSalesOrders() {
        return salesOrderRepository.findAll();
    }

    public Optional<SalesOrder> getSalesOrderById(Long id) {
        return salesOrderRepository.findById(id);
    }

    public SalesOrder updateSalesOrder(Long id, SalesOrder salesOrderDetails) {
        SalesOrder salesOrder = salesOrderRepository.findById(id).orElseThrow();
        salesOrder.setOrderNo(salesOrderDetails.getOrderNo());
        salesOrder.setAddress(salesOrderDetails.getAddress());
        salesOrder.setPrice(salesOrderDetails.getPrice());
        salesOrder.setPhoneNumber(salesOrderDetails.getPhoneNumber());
        return salesOrderRepository.save(salesOrder);
    }

    public void deleteSalesOrder(Long id) {
        salesOrderRepository.deleteById(id);
    }
}
