package com.fanyang.test;

import com.fanyang.exercise.Student;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student("fangYang1",21);
        student1.prints();
        Student student2 = new Student("fanYang2",21,"CQUST");
        student2.prints();
        Student student3 = new Student("fanYang",21,"CQUST","software engineer");
        student3.prints();
    }
}


