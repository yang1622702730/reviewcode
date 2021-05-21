package com.fanyang.test;

import com.fanyang.exercises.ArrayTools;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayToolsTest {
    public static void main(String[] args){
        ArrayTools arrayTools = new ArrayTools();
        int[] arrays = new int[]{-2,1,2,3,4,5,6,7,8,9,-100};
        int max = arrayTools.getMax(arrays);
        arrayTools.printInfo(max);
        int min = arrayTools.getMin(arrays);
        arrayTools.printInfo(min);
        int sum = arrayTools.getSum(arrays);
        arrayTools.printInfo(sum);
        double avg =  arrayTools.getAvg(arrays);
        System.out.println(avg);
        int[] newArray = arrayTools.copy(arrays);
        arrayTools.printInfo(newArray);
        int[] reverseArray = arrayTools.reverse(arrays);
        arrayTools.printInfo(reverseArray);
        int[] bubbleArray = arrayTools.bubbleSort(arrays);
        arrayTools.printInfo(bubbleArray);
        int index = arrayTools.getIndex(arrays, -2);
        arrayTools.printInfo(index);
    }
}
