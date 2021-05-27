package com.fanyang.exercise10;

import java.util.Objects;

/**
 * @program: day9
 * @description: Person
 * @author: FanYang
 * @create: 2021-05-27 20:23
 */
public class Person {
    private String name;
    private int height;
    private String weapon;
    private String race;

    public Person() {
    }

    public Person(String name, int height, String weapon, String race) {
        this.name = name;
        this.height = height;
        this.weapon = weapon;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weapon='" + weapon + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
    public void skill(Person person){
        if (person.getName()=="孙悟空"){
            System.out.println("我是孙悟空，我会七十二变");
        }
        else if (person.getName()=="唐僧"){
            System.out.println("我是唐僧，我会紧箍咒");
        }
        else{
            System.out.println("我是白骨精，我会九阴白骨爪");
        }
    }
//    public boolean equals(Object object){
//        if (this==object){
//            return true;
//        }
//        if (object instanceof Person){
//            Person person1 = (Person)object;
//            if (this.getName().equals("仙族")&&person1.getName().equals("仙族"))
//            return this.getName().equals(person1.getName())
//        }
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getRace().equals(person.getRace());
    }

}
