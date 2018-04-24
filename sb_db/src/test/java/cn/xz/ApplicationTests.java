package cn.xz;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.UUID;

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
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageHelper;

import cn.xz.cache.RedisBaseDao;
import cn.xz.dao.CloudUserInfoMapper;
import cn.xz.dao.CustomMapper;
import cn.xz.entity.CloudUserInfo;
import cn.xz.entity.CloudUserInfoExample;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mvc;

    @Autowired
    private CloudUserInfoMapper userInfoMapper;
    @Autowired
    private CustomMapper customMapper;
    @Autowired
    private MyProperties myProperties;
    @Autowired
    private RedisBaseDao<String> redisBaseDao;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
        log.debug("{}", myProperties.getConfig1());
        log.debug("{}", myProperties.getConfig2());
    }

    @Test
    public void contextLoads() throws Exception {
        log.info("ok");
        // mybatis
        CloudUserInfo userInfo = userInfoMapper.selectByPrimaryKey("13007817442");
        log.info("userInfo: {}", userInfo);

        // mybatis page
        CloudUserInfoExample example = new CloudUserInfoExample();
        example.createCriteria().andUserIdIsNotNull();
        PageHelper.startPage(0, 6, false);
        List<CloudUserInfo> list = userInfoMapper.selectByExample(example);
        log.debug("page result no: {}", list.size());

        // mybatis annotation
        log.info("customMapper: {}", customMapper.test());

        // redis
        redisBaseDao.set("1", UUID.randomUUID().toString(), 1);
        log.debug("{}", redisBaseDao.get("1"));

        // mock mvc
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }

}
