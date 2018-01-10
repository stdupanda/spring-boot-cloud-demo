package cn.xz.mq.other;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import cn.xz.config.RabbitMQConfig;

@Service
@RabbitListener(queues = RabbitMQConfig.MQ_QUEUE_NAME)
public class MQReceiver {

    private static final Logger log = LoggerFactory.getLogger(MQReceiver.class);

    @RabbitHandler
    public void process(String message) {// 只能接收 String 类型的消息
        log.debug("recv: {}", message);
    }

    @RabbitHandler
    public void process(List<String> message) {// 必须单独声明对应的接收类型，否则无法接收
        log.debug("recv: {}", message);
    }
}
