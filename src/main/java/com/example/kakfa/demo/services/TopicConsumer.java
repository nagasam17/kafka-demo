package com.example.kakfa.demo.services;

import com.example.kakfa.demo.model.Person;
import com.example.kakfa.demo.model.Topic;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicConsumer {

    @KafkaListener(topics = "PERSON_TOPIC", groupId = "person-consumer-group-1")
    public void consume(Person person) {
        // Process the person object (which is deserialized from Avro)
        System.out.println("Received Avro Person: " + person);

    }
}
