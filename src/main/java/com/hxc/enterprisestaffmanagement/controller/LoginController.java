package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.User;
import com.hxc.enterprisestaffmanagement.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {
    @Resource
    private UserService userService;
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("doLogin")
    public String doLogin(User user, HttpSession session, ModelMap modelMap){
        String forward = "";
        User login = this.userService.login(user);
        if(login != null){
            session.setAttribute("user",login);
            forward = "index";
        }else {
            String msg = "     对不起，用户名或密码错误！";
            modelMap.put("msg",msg);
            forward = "login";
        }
        return forward;
    }


 /*   @WebServlet(name = "ExitSysServlet", urlPatterns = "/Login")
    public class ExitSysServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            session.invalidate();
            request.getRequestDispatcher("Login").forward(request,response);
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request, response);
        }
    }*/

}
