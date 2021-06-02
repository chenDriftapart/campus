package com.example.campus.service;

import com.example.campus.Functions.DateFormat;
import com.example.campus.dao.DictionaryDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService {

    @Resource
    private DictionaryDao booksDao;

    DateFormat dateFormat=new DateFormat();

    public int getCount(){
        return booksDao.getBookCateCount();
    }

    public Map<String,Object> getData(){
        Map<String,Object> map=new HashMap<>();
        ArrayList<String> list=dateFormat.getDays(7);
        int count=booksDao.getBookCateCount();
        map.put("bookCateCount",count);
        map.put("week",list);
        return map;
    }
}
