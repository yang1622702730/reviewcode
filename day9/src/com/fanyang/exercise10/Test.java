package com.fanyang.exercise10;

/**
 * @program: day9
 * @description: Test
 * @author: FanYang
 * @create: 2021-05-27 20:25
 */
public class Test {
    public static void main(String[] args){
        Person person1 = new Person("唐僧",165,"紧箍咒","人族");
        Person person2 = new Person("孙悟空",185,"金箍棒","仙族");
        Person person3 = new Person("白骨精",160,"爪子","妖族");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        Person person = new Person();
        person.skill(person1);
        person.skill(person2);
        person.skill(person3);
    }
}
