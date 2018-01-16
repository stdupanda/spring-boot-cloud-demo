package cn.xz.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCtrl {
    @RequestMapping("")
    public Map<String, String> hello(@RequestParam(value = "name", required = true) String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("time", "" + System.currentTimeMillis());
        return map;
    }
}
