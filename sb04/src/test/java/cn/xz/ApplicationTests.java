package cn.xz;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import cn.xz.dao.CloudUserInfoMapper;
import cn.xz.dao2.CustomMapper2;
import cn.xz.entity.CloudUserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);

    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private CloudUserInfoMapper userInfoMapper;
    @Autowired
    private CustomMapper2 customMapper2;

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    @Transactional(transactionManager = "datasource01TransactionManager")
    public void contextLoads() throws Exception {
        log.info("mybatis multi datasource test.");
        // mybatis
        CloudUserInfo userInfo = userInfoMapper.selectByPrimaryKey("13007817442");
        log.info("userInfo: {}", userInfo);
        log.info("datasource 2 test : {}", customMapper2.test());
        log.info("ok");
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }

}
