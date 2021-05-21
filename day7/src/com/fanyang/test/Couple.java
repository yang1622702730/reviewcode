package com.fanyang.test;

import com.fanyang.exercises.Husband;
import com.fanyang.exercises.Wife;

public class Couple {
    public static void main(String[] args){
        Wife wife = new Wife();
        Husband husband = new Husband();
        wife.getInfo(new Husband());
        husband.getInfo(new Wife());
    }
}
