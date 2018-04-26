package cn.xz.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.xz.service.HelloService;

@RestController
@RequestMapping("/test")
public class TestCtrl {

    private static final Logger log = LoggerFactory.getLogger(TestCtrl.class);

    @Autowired
    private HelloService helloService;

    @RequestMapping("")
    public Map<String, String> hello(@RequestParam(value = "name", required = true) String name) {
        log.debug("{}", name);
        Map<String, String> map = new HashMap<>();
        helloService.hello(name);
        map.put("name", name);
        map.put("time", "" + System.currentTimeMillis());
        return map;
    }
}
