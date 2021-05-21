package com.fanyang.test;

import com.fanyang.exercises.Person;


public class ExercisePersonTest {

    public static void main(String[] args){
        Person person = new Person();
        person.study();
        person.sex = 1;
        person.age = 21;
        person.showAge();
        int newAge = person.addAge(2);
        System.out.println(newAge);
        System.out.println(person.age);
    }
}
