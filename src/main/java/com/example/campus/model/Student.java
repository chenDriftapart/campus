package com.example.campus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**主键**/
    private int id;
    /**姓名**/
    private String name;
    /**学号**/
    private int number;
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
}
