package com.example.providerticket.Dao;

import com.example.providerticket.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserDao {

    //查询单个用户
    public User getUser(@Param("userId")String userId);

}
