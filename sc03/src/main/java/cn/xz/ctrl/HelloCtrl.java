package cn.xz.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.xz.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloCtrl {

    private static final Logger log = LoggerFactory.getLogger(HelloCtrl.class);

    @Autowired
    private HelloService helloService;
    
    @RequestMapping("")
    public String hello(@RequestParam(value = "name", required = true) String name) {
        log.debug("{}", name);
        helloService.hello(name);
        return name;
    }
}
