package com.fanyang.test;

/**
 * @program: day10
 * @description: Singleton
 * @author: FanYang
 * @create: 2021-06-02 00:02
 */

/**
 * @Description: 饿汉式
 * @Prame:
 * @return:
 * @author: FanYang
 * @time:
 */
public class Singleton {
    private Singleton(){}
    private Singleton singleton = new Singleton();
    public Singleton getSingleton(){
        return singleton;
    }
}
