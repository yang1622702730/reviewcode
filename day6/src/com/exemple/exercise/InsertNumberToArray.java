package com.exemple.exercise;

import java.util.Arrays;
import java.util.Scanner;

//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
public class InsertNumberToArray {
    public static void main(String[] args){
        int[] arrays = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<arrays.length-1;i++){
            System.out.println("请输入值");
            arrays[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("请输入你要插入的值");
        int number = scanner.nextInt();
        if (number >= arrays[arrays.length-2]){
            arrays[arrays.length-1] = number;
        }
        for (int i = arrays.length-2;i>=0;i--){
            if (number<arrays[i]){
                arrays[i+1] = arrays[i];
                arrays[i] = number;
            }
            else{
                break;
            }
        }
        System.out.println(Arrays.toString(arrays));

    }
}
