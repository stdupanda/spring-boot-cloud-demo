package cn.xz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.xz.entity.CloudUserInfo;
import cn.xz.entity.CloudUserInfoExample;

public interface CloudUserInfoMapper {
    int countByExample(CloudUserInfoExample example);

    int deleteByExample(CloudUserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(CloudUserInfo record);

    int insertSelective(CloudUserInfo record);

    List<CloudUserInfo> selectByExample(CloudUserInfoExample example);

    List<CloudUserInfo> selectYesterday();

    CloudUserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") CloudUserInfo record, @Param("example") CloudUserInfoExample example);

    int updateByExample(@Param("record") CloudUserInfo record, @Param("example") CloudUserInfoExample example);

    int updateByPrimaryKeySelective(CloudUserInfo record);

    int updateByPrimaryKey(CloudUserInfo record);
}
