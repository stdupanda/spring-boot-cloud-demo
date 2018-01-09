package cn.xz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.xz.entity.CloudUserInfo;

public interface UserInfoRepository extends JpaRepository<CloudUserInfo, String> {
    List<CloudUserInfo> findByUserId(String userId);

    List<CloudUserInfo> findByUserIdIsNotNull();
}
