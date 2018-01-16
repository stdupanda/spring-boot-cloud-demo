package cn.xz.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCtrl {

    private static final Logger log = LoggerFactory.getLogger(HelloCtrl.class);

    @RequestMapping("")
    public Map<String, String> hello(@RequestParam(value = "name", required = true) String name) {
        log.debug("{}", name);
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("time", "" + System.currentTimeMillis());
        return map;
    }
}
