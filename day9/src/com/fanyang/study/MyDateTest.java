package com.fanyang.study;

        import java.util.Objects;

/**
 * @program: day9
 * @description: MyDate的测试
 * @author: FanYang
 * @create: 2021-05-26 15:34
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(14,3,1976);
        MyDate myDate2 = new MyDate(14,3,1976);
        if (myDate1==myDate2){
            System.out.println("m1 == m2");
        }
        else{
            System.out.println("m1 != m2");
        }
        if (myDate1.equals(myDate2)){
            System.out.println("m1 is equal to m2");
        }
        else{
            System.out.println("m1 is not equal to m2");
        }
    }
}
