package com.fanyang.exercise4;

import java.util.Date;

/**
 * @program: day9
 * @description: Person的测试类
 * @author: FanYang
 * @create: 2021-05-26 20:30
 */
public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person(1231234,'男',"杨凡",21,"四川", new Date());
        Person person2 = new Person(1231234,'男',"杨三",21,"四凡", new Date());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person1.equals(person2));
    }
}
