package com.fanyang.test;

import com.fanyang.exercises.Students;

public class StudentsTest {
    public static void main(String[] args){
        Students student = new Students();
        String info = student.say();
        System.out.println(info);
    }
}
