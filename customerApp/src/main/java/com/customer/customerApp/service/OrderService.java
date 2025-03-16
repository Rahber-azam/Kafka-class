package com.customer.customerApp.service;

import com.customer.customerApp.constent.AppConstants;
import com.customer.customerApp.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;
//    url of kafka, JsonSerializer,String Serializer(no)

    public String addMsg(Order order) {

        // sends msg to kafka topic
        kafkaTemplate.send(AppConstants.TOPIC, order);

        return "Msg Published To Kafka Topic";
    }
}
