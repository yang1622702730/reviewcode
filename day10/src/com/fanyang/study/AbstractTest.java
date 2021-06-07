package com.fanyang.study;

/**
 * @program: day10
 * @description:
 * @author: FanYang
 * @create: 2021-06-02 15:30
 */
public class AbstractTest {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.eat();
        Student student = new Student();
        student.eat();
    }


}

abstract class Person {
    String name;
    int age;

    public Person() {
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
class Student extends Person{

}
