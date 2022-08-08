package com.fualdistributionallocation.allocationservice.controller;

import com.fualdistributionallocation.allocationservice.logic.InventoryLogic;
import com.fualdistributionallocation.allocationservice.model.Order;

import com.fualdistributionallocation.allocationservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class OrderController {


    @Autowired
    private InventoryLogic allocationlogic;

    @Autowired
    Order order1;

    @Autowired
    private InventoryService allocateservice;


    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    private static final String topic = "schedule";




    @KafkaListener(topics = "order", groupId = "group")
    public void consume(String message) {
        System.out.println("Listner message: " + message);

        if(message.length()==6) {
            allocationlogic.setIdValues(message.substring(0, 4));
            allocationlogic.setFualTypeValues(message.substring(4, 5));
            allocationlogic.setCapacityValues(message.substring(5, 6));

            if(allocationlogic.allocate()){
                allocateservice.save(order1);

                Order od = allocateservice.fetchOrderById(order1.getId());
                System.out.println(od.toString());
                kafkaTemplate.send(topic, od);
            }
        }
        else
            System.out.println("Wrong ID");
    }




}
