package cn.xz.ctrl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "api", tags = "测试接口")
@RestController
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

    @ApiOperation(value = "测试", notes = "测试")
    @ApiImplicitParam(name = "name", value = "value", required = true, dataType = "string")
    @RequestMapping("/hello")
    public String index() {
        log.debug("{}", System.nanoTime());
        return "Hello World" + getString();
    }
}