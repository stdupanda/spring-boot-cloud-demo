package cn.xz.dao;

import org.apache.ibatis.annotations.Select;

public interface CustomMapper {

    @Select("SELECT NOW()")
    String test();
}
