package cn.xz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CustomServiceHystrix {

    private static final Logger log = LoggerFactory.getLogger(CustomServiceHystrix.class);

    @HystrixCommand(fallbackMethod = "testFallback")
    public int test() {
        log.debug("为了测试此处直接抛异常");
        throw new RuntimeException("(゜-゜)つロ 干杯~");
    }

    public int testFallback() {
        log.debug("说明熔断器起作用了");
        return -1;
    }

}
