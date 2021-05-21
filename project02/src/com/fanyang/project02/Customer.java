package com.fanyang.project02;

/**
 * @program: project2
 * @description: Customer为实体对象，用来封装客户信息
 * @author: FanYang
 * @create: 2021-05-19 15:06
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;
    public void setName(String name){
        this.name = name;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return  this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public String getPhone(){
        return  this.phone;
    }
    public String getEmail(){
        return this.email;
    }
    public Customer(){};
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
