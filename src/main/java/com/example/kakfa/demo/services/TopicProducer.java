package com.example.kakfa.demo.services;

import com.example.kakfa.demo.model.Customer;
import com.example.kakfa.demo.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicProducer {

    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public TopicProducer(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    public void PublishToCustomerEven(Customer customer)
    {

        kafkaProducerService.sendMessage(Topic.CUSTOMER_EVEN_TOPIC.getTopicName(),customer );
    }
    public void PublishToCustomerOdd(Customer customer){
        kafkaProducerService.sendMessage(Topic.CUSTOMER_ODD_TOPIC.getTopicName(),customer );

    }
}
