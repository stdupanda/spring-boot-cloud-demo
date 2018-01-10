package cn.xz.dao2;

import org.apache.ibatis.annotations.Select;

public interface CustomMapper2 {

    @Select("SELECT NOW()")
    String test();
}
