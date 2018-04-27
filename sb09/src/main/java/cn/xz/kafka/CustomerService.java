package cn.xz.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @KafkaListener(topics= {"test_topic"})
    public void recv(String msg) {
        log.debug("recv msg: {}", msg);
    }
}
