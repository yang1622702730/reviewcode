package com.fanyang.study;

/**
 * @program: day9
 * @description: Animal的测试
 * @author: FanYang
 * @create: 2021-05-24 22:18
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.func(new Dog());
        animalTest.func(new Cat());
    }
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}
