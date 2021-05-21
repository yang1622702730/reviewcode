package com.fanyang.test;

import com.fanyang.exercises.NewStudent;

public class NewStudentTest {
    public static void main(String[] args) {
        NewStudent[] newStudent = new NewStudent[20];
//        System.out.println(newStudent);
        for (int i = 0; i < 20; i++) {
            newStudent[i] = new NewStudent();
            newStudent[i].number = i + 1;
//            System.out.println(newStudent[i]);
            int newRandom = newStudent[i].creatRandom();
            System.out.println(newRandom);
            int state = newStudent[i].randomState();
            System.out.println(state);
        }
        System.out.println("————————————————————————————————");
        NewStudent newStudent1 = new NewStudent();//为什么这儿要通过实例化同一类型的一个新对象来调用方法呢?????
        newStudent1.searchState(newStudent,3);
//        System.out.println("!!!!!!"+newStudent1.number);

        System.out.println("————————————————————————————————");
        newStudent1.bubbleSort(newStudent);
        for (int i = 0; i < newStudent.length - 1; i++) {
            System.out.println(newStudent[i].info());
        }
    }
}
