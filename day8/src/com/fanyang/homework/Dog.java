package com.fanyang.homework;

/*设计一个Dog类，有名字、颜色和年龄属性，定义构造器初始化这些属性，定义输出方法show()显示其信息。
        提供无参的构造器和一个有参的构造器
*/


public class Dog {
    String name;
    String color;
    int age;
    public Dog(){
        System.out.println("这是一个空参构造器");
    }
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    /**
     * Description 展示狗的信息
     */
    public void show(){
        System.out.println("name = "+name+", color = "+color+",age = "+age);
    }
}
