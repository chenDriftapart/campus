package com.example.campus.controller;

import com.example.campus.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class CheckController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/checkLogin")
    @ResponseBody
    public Map<String, String> checkLogin(@RequestParam("username") String username,
                                          @RequestParam("password") String password,
                                          HttpSession session) {
        System.out.println("username=====>"+username+"  " +"password======>"+password);
        Map<String, String> res = adminService.checkUser(username, password, session);
        return res;

    }
}
