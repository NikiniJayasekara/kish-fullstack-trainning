package com.fualdistributionallocation.allocationservice.service;

import com.fualdistributionallocation.allocationservice.model.Order;


public interface InventoryService {

        Order save(Order order);

        Order fetchOrderById(int id);

}
