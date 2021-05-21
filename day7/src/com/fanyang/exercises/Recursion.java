package com.fanyang.exercises;

public class Recursion {
    public int regularEvaluation(int n){
        if (n ==0){
            return 1;
        }
        else if (n==1){
            return 4;
        }
        else {
            return 2*regularEvaluation(n-1)+regularEvaluation(n-2);
        }
    }
    public int Fibonacci(int n){
        if (n ==0){
            return 1;
        }
        else if (n ==1 ){
            return 1;
        }
        else{
            return Fibonacci(n-1)  + Fibonacci(n-2);
        }
    }
}
