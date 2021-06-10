package com.fanyang.exception.exercise1;

/**
 * @program: day11
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 11:26
 */
public class MyException extends Exception{
    static final long serialVersionUID = -338751124229948L;
    public MyException(String msg){
        super(msg);
    }
}
