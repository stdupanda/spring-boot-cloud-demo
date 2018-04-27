package cn.xz.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleSend {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(cron = "0/5 * * * * ?")
    public void send() {
        kafkaTemplate.send("test_topic", "" + System.nanoTime()).addCallback(o -> System.out.println("send-消息发送成功"),
                throwable -> System.out.println("消息发送失败"));
    }
}
