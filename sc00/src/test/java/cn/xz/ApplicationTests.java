package cn.xz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);

    @Before
    public void setUp() throws Exception {
        log.info("@Before");
    }

    @Test
    public void contextLoads() throws Exception {
        log.info("ok");
    }
}
