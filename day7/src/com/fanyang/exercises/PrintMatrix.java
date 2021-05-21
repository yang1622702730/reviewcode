package com.fanyang.exercises;

public class PrintMatrix {
    public double method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        double area = 10 * 8;
        return area;
    }

    public double method2(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        double area = m * n;
        return area;
    }

}
