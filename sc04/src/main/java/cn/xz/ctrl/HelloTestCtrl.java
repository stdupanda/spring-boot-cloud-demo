package cn.xz.ctrl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xz.service.HelloService;

@Controller
@RequestMapping("/t")
public class HelloTestCtrl {

    private static final Logger log = LoggerFactory.getLogger(HelloTestCtrl.class);

    @Autowired
    private HelloService helloService;
    
    @RequestMapping("")
    public String t() throws Exception {
        for (int i = 0; i < 10; i++) {
            String name = System.currentTimeMillis() + "哈哈哈";
            Map<String, String> hello = helloService.hello(name);
            String ret = new ObjectMapper().writeValueAsString(hello);
            log.debug("==============");
            log.debug("{}", ret);
            log.debug("==============");
            log.debug("");
            Thread.sleep(3000);
        }
        return "" + System.currentTimeMillis();
    }
}
