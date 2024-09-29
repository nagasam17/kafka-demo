package com.example.kakfa.demo.controller;

import com.example.kakfa.demo.model.Customer;
import com.example.kakfa.demo.model.CustomerType;
import com.example.kakfa.demo.model.Person;
import com.example.kakfa.demo.services.TopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Autowired
    TopicProducer topicProducer;
    void publishToCustomerTopic(Person p) {

        Customer customer = new Customer(p);
        if(customer.getCustomerType().equals(CustomerType.EVEN))
        {
            topicProducer.PublishToCustomerEven(customer);
        }
        else {
            topicProducer.PublishToCustomerOdd(customer);
        }
    }
}
