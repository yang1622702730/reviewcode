package com.fanyang.test;

import com.fanyang.exercises.Overload;

public class OverloadTest {
    public static void main(String[] args){
        Overload overload = new Overload();
        int result1 = overload.mOL(1);
        System.out.println(result1);
        int result2 = overload.mOL(1,2);
        System.out.println(result2);
        overload.mOL("1232312344");
        overload.max(1,2);
        overload.max(1.2,2.2);
        overload.max(1.2,2.4,1.8);
    }
}
