package cn.xz.ctrl;

import java.util.Random;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "test_topic";

    private String getString() {
        int num = new Random().nextInt(10);
        String str = "";
        for (int i = 0; i < num; i++) {
            str += "<br/>";
        }
        return "ok !" + str + System.currentTimeMillis();
    }

    @RequestMapping("/hello")
    public String index() {
        log.debug("{}", System.nanoTime());
        ListenableFuture<SendResult<String,String>> send = kafkaTemplate.send(topic , "" + System.currentTimeMillis());
        try {
            send.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Hello World" + getString();
    }
}