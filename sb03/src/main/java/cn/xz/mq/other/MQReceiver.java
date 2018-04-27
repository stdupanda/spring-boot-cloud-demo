package cn.xz.mq.other;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xz.config.RabbitMQConfig;

@Service
public class MQReceiver {

    private static final Logger log = LoggerFactory.getLogger(MQReceiver.class);

    @Autowired
    private MQPublisher mqPublisher;

    @RabbitListener(queues = RabbitMQConfig.MQ_QUEUE_NAME)
    @RabbitHandler
    public void process(String message) {// 只能接收 String 类型的消息
        log.debug("recv: {}", message);
        mqPublisher.publish(message);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RabbitListener(queues = RabbitMQConfig.MQ_QUEUE_NAME)
    @RabbitHandler
    public void process(Long message) {// 必须单独声明对应的接收类型，否则无法接收
        log.debug("recv long: {}", message);
    }
}
