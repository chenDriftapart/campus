package com.example.campus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperStudent extends Student{
    /**主键**/
    private int bid;
    /**图书编号**/
    private int num;
    /**图书名称**/
    private String bname;
}
