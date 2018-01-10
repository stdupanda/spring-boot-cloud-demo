package cn.xz.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xz.config.RabbitMQConfig;

@Service
public class MQService {

    private static final Logger log = LoggerFactory.getLogger(MQService.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendQueue(String exchange_key, String queue_key, Object object) {
        amqpTemplate.convertAndSend(exchange_key, queue_key, object);
    }

    public void sendQueue(String queue_key, Object object) {
        amqpTemplate.convertAndSend(queue_key, object);
    }

    public void test() {
        log.debug("mq test begin.");
        String msg = "hello" + System.currentTimeMillis();
        sendQueue(RabbitMQConfig.MQ_QUEUE_NAME, msg);
        log.debug("sent str: {}", msg);
        char[] charArray = Long.toString(System.currentTimeMillis()).toCharArray();
        String[] strArr = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            strArr[i] = String.valueOf(charArray[i]);
        }
        List<String> asList = Arrays.asList(strArr);
        log.debug("sent obj: {}", asList);
        sendQueue(RabbitMQConfig.MQ_QUEUE_NAME, asList);
        log.debug("mq test end  .");
    }
}
