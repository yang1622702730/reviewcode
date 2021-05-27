package com.fanyang.exercise1;

/**
 * @program: day9
 * @description: Test类
 * @author: FanYang
 * @create: 2021-05-24 16:23
 */
public class Test {
    public static void main(String[] args){
        Person p1 = new Faculty("本科");
        Faculty faculty = (Faculty)p1;
        System.out.println(p1.getName());
        System.out.println(faculty.getDegree());
        Person p2 = new Staff("职员");
        Staff staff = (Staff)p2;
        System.out.println(staff.getDuty());
    }
}
