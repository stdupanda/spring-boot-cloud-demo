package cn.xz.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xz.dto.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "/user", tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserCtrl {

    private static final Logger log = LoggerFactory.getLogger(UserCtrl.class);

    @ApiOperation(value = "测试用户信息", notes = "测试接口", response = UserInfo.class)
    @ApiImplicitParam(name = "user", value = "User请求信息", required = true ,dataType = "UserInfo")
    @PostMapping("/hello")
    public UserInfo index(@ApiParam(value = "The id of the city" ,required=true )@RequestBody UserInfo user) {
        log.debug("{}", System.nanoTime());
        return new UserInfo();
    }

}