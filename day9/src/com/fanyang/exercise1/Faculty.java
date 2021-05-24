package com.fanyang.exercise1;

/**
 * @program: day9
 * @description: Faculty的相关操作
 * @author: FanYang
 * @create: 2021-05-24 16:14
 */
public class Faculty extends Employee{
    private String degree;
    private String level;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Faculty(String office, double wage, String hireDate, String degree, String level) {
        super(office, wage, hireDate);
        this.degree = degree;
        this.level = level;
    }
    public Faculty(String degree){
        this.degree = degree;
    }

    public Faculty() {
    }
}
