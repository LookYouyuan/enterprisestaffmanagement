package com.hxc.enterprisestaffmanagement.mapper;


import com.hxc.enterprisestaffmanagement.entity.User;

public interface UserMapper{
    User login(User user);
    int updatePassword(User user);
}
