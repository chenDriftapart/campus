package com.example.campus.controller;

import com.example.campus.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    private StudentService sds;

    @RequestMapping("/getStuData")
    public Map<String,Object> getStuData(int page,int limit){
        System.out.println("page==>"+page);
        System.out.println("limit==>"+limit);
        return sds.getStuData(page,limit);
    }

}
