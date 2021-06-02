package com.example.campus.service;

import com.example.campus.dao.AdminDao;
import com.example.campus.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminService {

    @Resource
    private AdminDao ad;

    public Map<String, String> checkUser(String uname, String password, HttpSession session) {
        Admin admin =ad.getAdmByName(uname);
        System.out.println("查询出来的用户======>"+admin);
        Map<String, String> res = new HashMap<>();
        if (admin != null) {
            if (password.equals(admin.getPassword())) {
                session.setAttribute("admin", admin);
                res.put("mes", "success");
                res.put("address", "/");
            } else {
                res.put("mes", "密码错误");
            }
        } else {
            res.put("mes", "用户不存在");
        }
        return res;
    }

    //插入用户
    public int insertAccount(Admin admin){
        return ad.insertAccount(admin);
    }

    //查询有没有重复的用户
    public List<Admin> getUserName(){
        return ad.getUserName();
    }
}
