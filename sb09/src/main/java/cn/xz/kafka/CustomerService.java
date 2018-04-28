package cn.xz.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @KafkaListener(topics = "test_topic")
    public void recv(ConsumerRecord<?, ?> msg) {
        log.debug("recv msg with topic: {}, key: {}, value: {}.", msg.topic(), msg.key(), msg.value());
    }
}
