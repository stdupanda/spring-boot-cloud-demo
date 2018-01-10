package cn.xz.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String MQ_QUEUE_NAME = "test_queue_666";

    @Bean
    public Queue queue() {
        return new Queue(MQ_QUEUE_NAME, true, false, false);
    }
}
