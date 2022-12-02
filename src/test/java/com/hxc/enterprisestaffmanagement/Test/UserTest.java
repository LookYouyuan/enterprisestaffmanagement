package com.hxc.enterprisestaffmanagement.Test;

import com.hxc.enterprisestaffmanagement.EnterprisestaffmanagementApplicationTests;
import com.hxc.enterprisestaffmanagement.entity.User;
import com.hxc.enterprisestaffmanagement.mapper.UserMapper;
import com.hxc.enterprisestaffmanagement.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

public class UserTest extends EnterprisestaffmanagementApplicationTests {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    @Test
    public void testlogin(){
        User user = new User("gjm","gjm");
        this.userService.login(user);
    }
}
