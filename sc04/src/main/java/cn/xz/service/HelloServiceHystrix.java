package cn.xz.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceHystrix implements HelloService {

    @Override
    public Map<String, String> hello(String name) {
        Map<String, String> map = new HashMap<>();
        map.put("！调用失败！", "Hystrix 起作用了");
        return map;
    }

}
