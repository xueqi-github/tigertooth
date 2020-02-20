package com.xue.tigertooth.mapper;

import com.xue.tigertooth.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CommonMapper<User> {
}