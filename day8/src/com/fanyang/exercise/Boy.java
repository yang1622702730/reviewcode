package com.fanyang.exercise;

public class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getName());
    }

    public void shout() {
        if (this.age > 22) {
            System.out.println("你已经达到合法结婚的年纪，可以登记结婚了");
        }
        else{
            System.out.println("你还要等"+(22-this.age)+"年就可以结婚了");
        }
    }
}
