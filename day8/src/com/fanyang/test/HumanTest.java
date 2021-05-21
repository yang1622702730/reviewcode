package com.fanyang.test;

import com.fanyang.homework.Human;

public class HumanTest {
    public static void main(String[] args){
        Human human = new Human("张三",'男',21);
        human.eat();
        human.selfIntroduction();
    }
}
