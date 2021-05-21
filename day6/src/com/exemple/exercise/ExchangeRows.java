package com.exemple.exercise;

import java.util.Arrays;

//定义一个4行4列的二维数组，逐个从键盘输入值，然后将第1行和第4行的数据
// 进行交换，将第2行和第3行的数据进行交换
public class ExchangeRows {
    public static void main(String[] args) {
        //方法一
//        int[][] twoArrayA = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {5, 6, 7, 8}, {5, 6, 7, 8}};
//        int[][] twoArrayB = new int[4][4];
////            System.out.println(Arrays.toString(twoArrayA[i]));
//        twoArrayB[0] = twoArrayA[3];
//        twoArrayB[1] = twoArrayA[2];
//        twoArrayB[2] = twoArrayA[1];
//        twoArrayB[3] = twoArrayA[0];
//        for (int i = 0; i < twoArrayB.length; i++) {
//            System.out.println(Arrays.toString(twoArrayB[i]));
//        }
        //方法二
        String[][] inarr = {{"A1","A2","A3","A3"},{"B1","B2","B3","B4"},{"C1","C2","C3","C4"},{"D1","D2","D3","D4"}};
        String[] temp = {};
        temp = inarr[0];
        inarr[0] = inarr[3];
        inarr[3] = temp;
        temp = inarr[2];
        inarr[2] = inarr[1];
        inarr[1] = temp;
        for (int i =0;i<inarr.length;i++){
            System.out.println(Arrays.toString(inarr[i]));
        }
    }

}
