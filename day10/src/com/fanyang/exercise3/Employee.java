package com.fanyang.exercise3;

/*定义一个Employee类，该类包含：
        private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
        abstract方法earnings()；
        toString()方法输出对象的name,number和birthday。*/
/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 17:48
 */
public abstract class Employee {
    private String name;
    private int number;
    private  MyDate birthday;
    public Employee(){}
    public Employee(String name,int number,MyDate myDate){
        this.birthday =myDate;
        this.name = name;
        this.number = number;
    }
    public abstract double earnings();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getMyDate() {
        return birthday;
    }

    public void setMyDate(MyDate myDate) {
        this.birthday = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", myDate=" + birthday +
                '}';
    }
}
