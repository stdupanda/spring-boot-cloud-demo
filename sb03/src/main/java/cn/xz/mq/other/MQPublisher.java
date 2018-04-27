package cn.xz.mq.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xz.config.RabbitMQConfig;

@Service
public class MQPublisher {

    private static final Logger log = LoggerFactory.getLogger(MQPublisher.class);
    
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void publish(String message) {
        amqpTemplate.convertAndSend(RabbitMQConfig.MQ_QUEUE_NAME, message);
        log.debug("recv: {}", message);
    }
}
