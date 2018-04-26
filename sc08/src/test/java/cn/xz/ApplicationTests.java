package cn.xz;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xz.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);

    @Autowired
    private HelloService helloService;

    @Before
    public void setUp() throws Exception {
        log.info("@Before");
    }

    @Test
    public void contextLoads() throws Exception {
        log.debug("=======================");
        log.info("ok");
        String name = System.currentTimeMillis() + "哈哈哈";
        Map<String, String> hello = helloService.hello(name);
        String ret = new ObjectMapper().writeValueAsString(hello);
        log.debug("{}", ret);
        log.debug("=======================");
    }
}
