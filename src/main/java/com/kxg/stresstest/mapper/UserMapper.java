package com.kxg.stresstest.mapper;

import com.kxg.stresstest.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CommonMapper<User> {
}