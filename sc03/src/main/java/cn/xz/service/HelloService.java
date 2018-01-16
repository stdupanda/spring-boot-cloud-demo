package cn.xz.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-eureka-producer")
public interface HelloService {
    @RequestMapping("/hello")
    Map<String, String> hello(@RequestParam(value = "name", required = true) String name);
}
