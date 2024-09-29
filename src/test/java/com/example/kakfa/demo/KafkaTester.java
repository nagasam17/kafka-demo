package com.example.kakfa.demo;


import org.apache.kafka.clients.consumer.Consumer;
        import org.apache.kafka.clients.consumer.ConsumerRecord;
        import org.apache.kafka.clients.consumer.ConsumerRecords;
        import org.apache.kafka.clients.consumer.KafkaConsumer;
        import org.apache.kafka.common.serialization.StringDeserializer;
        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.kafka.test.context.EmbeddedKafka;
        import org.springframework.kafka.test.utils.KafkaTestUtils;

        import java.util.Collections;
        import java.util.Map;
/*
@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = { "testTopic" })
public class KafkaTester {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    public void testKafkaProducerAndConsumer() {
        // Send a message
        kafkaTemplate.send("testTopic", "testKey", "testMessage");

        // Create a consumer
        Map<String, Object> consumerProps = KafkaTestUtils.consumerProps("testGroup", "true", embeddedKafkaBroker);
        Consumer<String, String> consumer = new KafkaConsumer<>(consumerProps, new StringDeserializer(), new StringDeserializer());
        consumer.subscribe(Collections.singleton("testTopic"));

        // Consume the message
        ConsumerRecords<String, String> records = KafkaTestUtils.getRecords(consumer);
        for (ConsumerRecord<String, String> record : records) {
            System.out.println("Consumed message: " + record.value());
        }
    }
}
*/