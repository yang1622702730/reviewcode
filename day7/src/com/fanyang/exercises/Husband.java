package com.fanyang.exercises;

public class Husband {
    public String name = "fanYang";
    public int age = 21;
//    Wife wife = new Wife();
    public void getInfo(Wife wife){
        System.out.println("我的信息为"+name+age+"我的妻子信息为"+wife.name+wife.age);
    }
}
