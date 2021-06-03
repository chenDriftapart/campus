package com.example.campus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Param {
    /**姓名**/
    private String username;
    /**学号**/
    private String number;
    /**系别**/
    private String department;
    /**寝室**/
    private String dormitory;
    /**年龄**/
    private int age;
    /**入学时间**/
    private String eTime;
    /**电话**/
    private String phone;
    /**性别**/
    private int sex;
    /**当前页**/
    private int page;
    /**限制**/
    private int limit;
    /**偏移量**/
    private int offset;
    /**数量**/
    private int count;
}
