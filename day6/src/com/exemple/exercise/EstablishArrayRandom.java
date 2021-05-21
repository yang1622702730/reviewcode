package com.exemple.exercise;

//面试题目：创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
public class EstablishArrayRandom {
    public static void main(String[] args) {
//        int[] array = new int[6];
//        int i = 0;
//        while (i < array.length) {
//            int randomNumber = (int) (Math.random() * 29 + 1);
//            array[i] = randomNumber;
//            for (int j = 0; j < i; j++) {
//                if (array[i] == array[j]){
//                    System.out.println("他们的值一样需要重新赋值"+array[j]+"=="+array[i]);
//                    array[i] = (int) (Math.random() * 29 + 1);
//                    System.out.println("重新赋值为"+array[i]);
//                }
//            }
//            System.out.println("array["+i+"] = "+array[i]);
//            i ++;
//        }
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
