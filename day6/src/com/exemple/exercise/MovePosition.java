package com.exemple.exercise;

import java.util.Arrays;

//有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
//定义两个数组，把移动的数组的值赋给另一个数组
public class MovePosition {
    public static void main(String[] args) {
        int[] arraysA = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arraysB = new int[10];
        System.out.println("向后移动三位");
        for (int i = arraysA.length-1;i>=0;i--){
            if (i>=arraysA.length-3){
                arraysB[i+3 -arraysA.length] = arraysA[i];
            }
            else{
                arraysB[i+3] = arraysA[i];
            }
        }
        System.out.println(Arrays.toString(arraysA));
        System.out.println(Arrays.toString(arraysB));
    }
}
