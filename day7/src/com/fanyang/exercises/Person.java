package com.fanyang.exercises;

public class Person{
    public String name;
    public int age = 21;
    public int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        age +=i;
        return age;
    }
}
