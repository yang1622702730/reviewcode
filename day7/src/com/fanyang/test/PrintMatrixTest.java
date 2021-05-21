package com.fanyang.test;

import com.fanyang.exercises.PrintMatrix;

public class PrintMatrixTest {
    public static void main(String[] args){
        PrintMatrix printMatrix = new PrintMatrix();
        double area1 = printMatrix.method1();
        System.out.println(area1);
        System.out.println();
        double area2 = printMatrix.method2(5,4);
        System.out.println(area2);
    }
}
