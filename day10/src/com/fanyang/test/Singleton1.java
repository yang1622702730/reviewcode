package com.fanyang.test;

/**
 * @program: day10
 * @description: Singleton1
 * @author: FanYang
 * @create: 2021-06-02 00:04
 */

/**
 * @Description: 懒汉式
 * @Prame:
 * @return:
 * @author: FanYang
 * @time:
 */
public class Singleton1 {
    private Singleton1(){}
    private Singleton1 singleton1 = null;
    public Singleton1 getSingleton1(){
        if (singleton1==null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
