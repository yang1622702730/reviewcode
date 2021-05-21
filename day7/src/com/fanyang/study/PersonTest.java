package com.fanyang.study;

public class PersonTest {
    public static void main(String[] args){
        Person fanYang = new Person();
        fanYang.age = 21;
        fanYang.gender = '男';
        fanYang.name = "杨凡";
        System.out.println(fanYang.age + fanYang.name+fanYang.gender);
        fanYang.sleep();
        fanYang.eat();
        fanYang.speak("中文");
        Person deng = new Person();
        System.out.println(deng.age);
        Person fanYang2 = fanYang;
        System.out.println(fanYang2.name);
        fanYang2.age = 10;
        System.out.println(fanYang.age);
    }
}
class Person{
    int age = 1;
    String name;
    char gender;
    public void sleep(){
        System.out.println("人得睡觉");
    }
    public void eat(){
        System.out.println("人得吃饭");
    }
    public void speak(String language){
        System.out.println("人得说话"+language);
    }

}