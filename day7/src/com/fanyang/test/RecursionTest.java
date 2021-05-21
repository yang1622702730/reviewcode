package com.fanyang.test;

import com.fanyang.exercises.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int result1 = recursion.regularEvaluation(10);
        System.out.println(result1);
        int result2 = recursion.Fibonacci(3);
        System.out.println(result2);
    }

}
