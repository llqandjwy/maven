package com.bdqn.mapper;

import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int login(@Param("name") String name, @Param("password") String password);
   /* @Select("select*from l_user")
    @ResultMap("studentMap")*/
    List<User> selects();
    int insert(User user);
}
