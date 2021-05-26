package com.fanyang.exercise4;

import java.util.Date;

/**
 * @program: day9
 * @description: Person的操作
 * @author: FanYang
 * @create: 2021-05-26 20:20
 */
public class Person {
    private int id;
    private char gender;
    private String name;
    private int age;
    private String location;
    private Date date;

    public Person(int id, char gender, String name, int age,
                  String location, Date date) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.location = location;
        this.date = date;
    }
    public Person(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", gender=" + gender +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", location='" + location + '\'' +
//                ", date=" + date +
//                '}';
//    }
    @Override
    public String toString(){
        return "Person{id=" +getId()+"name="+getName()+"location="+getLocation()+"}";
    }
    public boolean equals(Object object){
        if (this==object){
            return true;
        }
        if (object instanceof Person){
            Person person1 = (Person)object;
            return this.id == person1.getId() &&
                    this.name.equals(person1.getName());
        }
        else{
            return false;
        }
    }
}
