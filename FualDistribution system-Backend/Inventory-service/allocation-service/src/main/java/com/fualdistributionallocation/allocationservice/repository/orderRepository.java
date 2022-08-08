package com.fualdistributionallocation.allocationservice.repository;

import com.fualdistributionallocation.allocationservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepository extends MongoRepository<Order, Integer> {
}
