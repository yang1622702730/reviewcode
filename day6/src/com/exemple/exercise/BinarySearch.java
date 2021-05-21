package com.exemple.exercise;


import java.util.Scanner;

//二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isFlog = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的数据");
        int dest = scanner.nextInt();
        int head = 0;
        int end = array.length - 1;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (array[middle]==dest){
                System.out.println("恭喜你找到了它，他的位置为"+middle);
                isFlog = false;
                break;
            }
            else if(array[middle] <dest){
                head = middle + 1;
            }
            else if(array[middle] >dest){
                end = middle -1;
            }
        }
        if (isFlog){
            System.out.println("没有找到他的位置");
        }

    }
}
