package com.hxc.enterprisestaffmanagement.service.Impl;

import com.hxc.enterprisestaffmanagement.entity.User;
import com.hxc.enterprisestaffmanagement.mapper.UserMapper;
import com.hxc.enterprisestaffmanagement.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserSeviceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return this.userMapper.login(user);
    }
    @Override
    public int updatePassword(User user){
        return this.userMapper.updatePassword(user);
    }
}
