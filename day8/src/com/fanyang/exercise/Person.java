package com.fanyang.exercise;

public class Person {
    //alt+insert快捷生成get/set等等方法
    private int age;
    public void setAge(int i){
        if (i >0 && i < 130) {
            age = i;
        }
        else {
            age = 0;
        }
    }
    public int getAge(){
        return age;
    }
    public void prints(){
        System.out.println(age);
    }


}
