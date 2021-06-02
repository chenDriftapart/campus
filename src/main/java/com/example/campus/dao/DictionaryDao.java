package com.example.campus.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictionaryDao {

    /**统计图书类别数量**/
    int getBookCateCount();
}
