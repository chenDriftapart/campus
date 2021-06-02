package com.example.campus.dao;

import com.example.campus.model.SuperStudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {

    /**
     * 查询学生信息
     * @return
     */
   List<SuperStudent> getStuData(int offset,int limit);

    /**
     * 查询学生总数
     * @return
     */
   int getStuCount();
}
