package cn.xz.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceHystrix implements HelloService {

    
    private static final Logger log = LoggerFactory.getLogger(HelloServiceHystrix.class);

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @Override
    public Map<String, String> hello(String name) {
        Map<String, String> forObject = restTemplate.getForObject("url", Map.class);
        log.debug("{}", forObject);
        Map<String, String> map = new HashMap<>();
        map.put("！调用失败！", "Hystrix 起作用了");
        return map;
    }

}
