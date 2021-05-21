package com.fanyang.exercises;

import java.util.Arrays;

public class ArrayTools {
    /**
     * Description 打印基本数据类型的信息
     * @param key
     */
    public void printInfo(int key){
        System.out.println(key);
        System.out.println();
    }

    /**
     * Description
     * @param array
     */
    public void printInfo(int[] array){
        System.out.println(Arrays.toString(array));
    }
    /**
     *
     * Description 求最大值
     * @param array
     * @return
     */
    public int getMax(int[] array) {
        int max = 0;
        for (int i =0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Description 求最小值
     * @param array
     * @return
     */
    public int getMin(int[] array) {
        int min = 0;
        for (int i = 0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Description 求和
     * @param array
     * @return
     */
    public int getSum(int[] array) {
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    /**
     * Description 求平均值
     * @param array
     * @return
     */
    public double getAvg(int[] array) {
        int sum = getSum(array);
        double avg = (sum/array.length);
        return avg;
    }

    /**
     * Description 复制数组
     * @param array
     * @return
     */
    public int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0;i<array.length;i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * Description 反转数组
     * @param array
     * @return
     */
    public int[] reverse(int[] array){
        int temp = 0;
        for (int i = 0; i<=array.length/2;i++){
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }

    /**
     * Description 冒泡排序
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array){
        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int getIndex(int[] array,int index){
        for (int i = 0;i<array.length;i++){
            if(array[i] == index){
                index = i;
                return index;
            }
        }
        return -1;
    }

}
