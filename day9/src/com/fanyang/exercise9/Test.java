package com.fanyang.exercise9;

/**
 * @program: day9
 * @description: Test
 * @author: FanYang
 * @create: 2021-05-27 20:18
 */
public class Test {
    public static void main(String[] args){
        Student s1 = new Student("杨凡",21,'男',1);
        Student s2 = new Student("杨凡",21,'男',1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
