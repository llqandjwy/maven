package com.accp.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int login(@Param("name") String name, @Param("password")String password);
}
