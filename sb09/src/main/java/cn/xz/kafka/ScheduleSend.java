package cn.xz.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleSend {

    private static final Logger log = LoggerFactory.getLogger(ScheduleSend.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 100)
    public void send() {
        String topic = "test_topic";
        String key = "test_key";
        String data = "" + System.nanoTime();
        kafkaTemplate.send(topic, key, data).addCallback(o -> log.debug("send-消息发送成功"),
                throwable -> log.error("消息发送失败"));
        log.debug("sent data: {}", data);
    }
}
