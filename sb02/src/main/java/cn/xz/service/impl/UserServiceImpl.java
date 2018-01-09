package cn.xz.service.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xz.entity.CloudUserInfo;
import cn.xz.repository.UserInfoRepository;
import cn.xz.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public void test() {
        log.debug("jpa test.");
        List<CloudUserInfo> list = userInfoRepository.findByUserId("13511111111");
        log.debug("list size {}", list.size());
        log.debug("list2: {}", userInfoRepository.findByUserIdIsNotNull());
        String userId = UUID.randomUUID().toString();
        String onlineMoney = UUID.randomUUID().toString();
        CloudUserInfo userInfo = new CloudUserInfo(userId, onlineMoney);
        CloudUserInfo userInfo2 = userInfoRepository.save(userInfo);
        log.debug("{} {}", userInfo.hashCode(), userInfo);
        log.debug("{} {}", userInfo2.hashCode(), userInfo2);
        log.debug("{}", userInfoRepository.findOne(userId));
        CloudUserInfo tmp = new CloudUserInfo();
        tmp.setUserId(userId);
        // ExampleMatcher init
        ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
                .withMatcher("userId", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
                .withIgnorePaths("focus"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
        Example<CloudUserInfo> example = Example.of(tmp, matcher);
        // jpa select by example with page
        List<CloudUserInfo> list2 = userInfoRepository.findAll(example, new Sort("userId"));// 经测试，排序条件不可以是 user_id
        log.debug("jpa example {}", list2);
        Sort sort = new Sort(Direction.DESC, "userId");
        Pageable pageable = new PageRequest(1, 10, sort);
        log.debug("jpa page1 {}", userInfoRepository.findAll(example, pageable));
        log.debug("jpa page2 {}", userInfoRepository.findAll(pageable));
    }
}
