package com.fanyang.test;

import com.fanyang.exercise.Boy;
import com.fanyang.exercise.Girl;

public class CoupleTest {
    public static void main(String[] args) {
        Boy boy = new Boy("fanYang",23);
        boy.shout();
        Girl girl1 = new Girl("mary",19);
        girl1.marry(boy);
        Girl girl2 = new Girl("mark",19);
        int compareResult = girl1.compare(girl2);
        System.out.println(compareResult);
    }
}
