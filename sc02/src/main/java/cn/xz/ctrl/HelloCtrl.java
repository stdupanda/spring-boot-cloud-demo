package cn.xz.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCtrl {
    @RequestMapping("")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("time", "" + System.currentTimeMillis());
        return map;
    }
}
