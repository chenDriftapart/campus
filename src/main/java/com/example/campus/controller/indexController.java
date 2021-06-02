package com.example.campus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class indexController {

    public static final Logger log = LoggerFactory.getLogger(indexController.class);

    @RequestMapping("/main")
    public String index(){
        return "page/welcome-1";
    }

    @RequestMapping("/main_1")
    public String main_1(){
        return "page/welcome-1";
    }

    @RequestMapping("/main_2")
    public String main_2(){
        return "page/welcome-2";
    }

    @RequestMapping("/main_3")
    public String main_3(){
        return "page/welcome-3";
    }
    @RequestMapping("/menu")
    public String menu(){
        return "page/menu.html";
    }
    @RequestMapping("/setting")
    public String setting(){
        return "page/setting";
    }
    @RequestMapping("/log_off")
    public String log_off(){
        return "page/login-3";
    }
    @RequestMapping("/login_1")
    public String login_1(HttpSession session){
        return "page/login-1";
    }
    @RequestMapping("/login_2")
    public String login_2(){
        return "page/login-2";
    }
    @RequestMapping("/table")
    public String table(){
        return "page/table";
    }
    @RequestMapping("/icon")
    public String icon(){
        return "page/icon";
    }
    @RequestMapping("/icon_picker")
    public String icon_picker(){
        return "page/icon-picker";
    }
    @RequestMapping("/button")
    public String button(){
        return "page/button";
    }
    @RequestMapping("/form")
    public String form(){
        return "page/form";
    }
    @RequestMapping("/form_step")
    public String form_step(){
        return "page/form-step";
    }
    @RequestMapping("/404")
    public String error(){
        return "page/404";
    }
    @RequestMapping("/add")
    public String add(){
        return "page/table/add";
    }
    @RequestMapping("/edit")
    public String edit(){
        return "page/table/edit";
    }
    @RequestMapping("/upload")
    public String upload(){
        return "page/upload";
    }
    @RequestMapping("/area")
    public String area(){
        return "page/area";
    }
    @RequestMapping("/table_select")
    public String table_select(){
        return "page/table-select";
    }
    @RequestMapping("/layer")
    public String layer(){
        return "page/layer";
    }
    @RequestMapping("/color_select")
    public String color_select(){
        return "page/color-select";
    }
    @RequestMapping("/editor")
    public String editor(){
        return "page/editor";
    }
    @RequestMapping("/lose")
    public String lose(){
        return "page/error";
    }

}
