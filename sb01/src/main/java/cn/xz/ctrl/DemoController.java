package cn.xz.ctrl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xz.MyProperties;
import cn.xz.MyPropertiesBean;

@RestController
@Transactional(timeout = 10)
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    private String getString() {
        int num = new Random().nextInt(10);
        String str = "";
        for (int i = 0; i < num; i++) {
            str += "<br/>";
        }
        return "ok !" + str + System.currentTimeMillis();
    }

    @Autowired
    private MyProperties myProperties;
    @Autowired
    private MyPropertiesBean bean;

    @RequestMapping("/hello")
    public String index() {
        log.debug("{}", System.nanoTime() + getString());
        log.debug("{} - {} 1s", myProperties.getConfig1(), myProperties.getConfig2());
        log.debug("{} - {} 1s", bean.getConfig1(), bean.getConfig2());
        return "Hello World";
    }
}
