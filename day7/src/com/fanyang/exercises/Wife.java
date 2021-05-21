package com.fanyang.exercises;

public class Wife {
    public String name = "???";
    public int age = 22;
//    Husband husband = new Husband();

    public void getInfo(Husband husband) {
        System.out.println("我的信息为" + name + age + "我的丈夫信息为" + husband.name + husband.age);

    }
}
