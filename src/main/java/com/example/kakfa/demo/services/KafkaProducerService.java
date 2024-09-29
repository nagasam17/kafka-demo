package com.example.kakfa.demo.services;

import com.example.kakfa.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, Customer> kafkaTemplate;

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, Customer> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, Customer customer) {
        kafkaTemplate.send(topic, customer);
    }
}
