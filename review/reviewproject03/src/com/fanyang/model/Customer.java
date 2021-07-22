package com.fanyang.model;

/**
 * @program: reviewproject03
 * @description: 顾客的基本属性和方法
 * @author: FanYang
 * @create: 2021-07-21 20:22
 */
public class Customer {
    private String name;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;

    public Customer(String name, String gender, int age, String phoneNumber, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "名字='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 年纪=" + age +
                ", 电话号码='" + phoneNumber + '\'' +
                ", 电子邮箱='" + email + '\'';
    }
}
