package cn.xz.ctrl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xz.MyProperties;
import cn.xz.MyPropertiesBean;

@RestController
//@Transactional(timeout = 10)
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    private String getString() {
        int num = new Random().nextInt(10);
        String str = "";
        for (int i = 0; i < num; i++) {
            str += "<br/>";
        }
        return "ok !" + str + System.currentTimeMillis();
    }

    @Autowired
    private MyProperties myProperties;
    @Autowired
    private MyPropertiesBean myPropertiesBean;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String index() {
        log.debug("{}", System.nanoTime() + getString());
        log.debug("{} - {} ", myProperties.getConfig1(), myProperties.getConfig2());
        log.debug("{} - {} ", myPropertiesBean.getConfig1(), myPropertiesBean.getConfig2());
        int update = jdbcTemplate.update("update cloud_user_info set `status`=1 where user_id='1'");
        log.debug("update: {}", update);
        String sqlPrefix = "INSERT INTO `cloud_card_pool` (`id`,`card_no`,`add_time`,`use_time`,`is_used`)VALUES";
        StringBuilder sb = new StringBuilder("");
        String sql = "";
//        int pageSize = 1000;
//        int total = 3;
//        int size = total / pageSize + 1;
//        for (int i = 1; i <= size; i++) {
//            int begin = i * size;
//            sb.setLength(0);
//            for (int j = begin; j < begin + pageSize; j++) {
//                sb.append("(UUID(),CONCAT('xxx',UUID()),now(),NULL,0),");
//            }
//            sql = sqlPrefix + sb.toString();
//            sql.substring(0, sql.length() - 1);
//            int tmp = jdbcTemplate.update(sql);
//            log.debug(sql);
//            log.debug("tmp update ret({}) : {}", i, tmp);
//        }
        for (int i = 0; i < 8000; i++) {
            sb = new StringBuilder("");
            for (int j = 0; j < 1000; j++) {
                sb.append("(UUID(),CONCAT('xxx',UUID()),now(),NULL,0),");
            }
            sql = sqlPrefix + sb.toString();
            sql = sql.substring(0, sql.length() - 1);
            int tmp = jdbcTemplate.update(sql);
            log.debug("tmp update ret({}) : {}", i, tmp);
        }
        return "Hello World";
    }

}
