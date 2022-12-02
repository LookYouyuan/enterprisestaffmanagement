package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.User;
import com.hxc.enterprisestaffmanagement.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class IndexController {

    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("index")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("welcome")
    public String toMain() {
        return "welcome";
    }
    @RequestMapping("updatePassword")
    public String updatePassword(String user_name ,ModelMap modelMap){
        modelMap.put("user_name", user_name );
        return "updatePassword";
    }
    @RequestMapping("doUpdatePassword")
    public String doUpdatePassword(User user,HttpSession session,ModelMap modelMap){
        String forward="";
        int updatePassword = this.userService.updatePassword(user);
        if(updatePassword != 0){
            session.setAttribute("user",updatePassword);
            forward = "login";
        }else {
            String msg = "对不起，修改密码失败！";
            modelMap.put("msg",msg);
            forward = "updatepassword";
        }
        return forward;
    }


}
