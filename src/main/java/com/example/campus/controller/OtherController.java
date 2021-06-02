package com.example.campus.controller;

import com.example.campus.service.DictionaryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OtherController {
    @Resource
    private DictionaryService booksService;

    @RequestMapping("/getData")
    public Map<String,Object> getData(){
        Map<String,Object> map=booksService.getData();
        return map;
    }
}
