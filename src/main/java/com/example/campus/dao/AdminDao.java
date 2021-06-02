package com.example.campus.dao;

import com.example.campus.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AdminDao {

    /**
     *
     * @param uname
     * @return
     */
    Admin getAdmByName(String uname);

    /**
     * 新增
     */
    int insertAccount(Admin admin);

    /**
     * 查询用户名
     */
    List<Admin> getUserName();


}
