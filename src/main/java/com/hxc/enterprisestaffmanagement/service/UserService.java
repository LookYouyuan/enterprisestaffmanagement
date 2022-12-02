package com.hxc.enterprisestaffmanagement.service;

import com.hxc.enterprisestaffmanagement.entity.User;

public interface UserService {
    User login(User user);
    int updatePassword(User user);
}
