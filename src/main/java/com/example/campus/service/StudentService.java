package com.example.campus.service;

import com.example.campus.dao.StudentDao;
import com.example.campus.model.Param;
import com.example.campus.model.SuperStudent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Resource
    private StudentDao sd;

    public Map<String,Object> getStuData(Param param){
        int page=param.getPage();
        int limit=param.getLimit();
        int offset=(page-1)*limit;
        param.setOffset(offset);
        Map<String,Object> map=new HashMap<>();
        List<SuperStudent> list=sd.getStuData(param);
        int count=sd.getStuCount(param);
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",list);
        return map;
    }



}
