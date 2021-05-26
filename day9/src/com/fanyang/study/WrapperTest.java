package com.fanyang.study;

import org.junit.jupiter.api.Test;

/**
 * @program: day9
 * @description: WrapperTest的操作
 * @author: FanYang
 * @create: 2021-05-26 16:47
 */
public class WrapperTest {
    @Test
    public void test4(){
        int num1 = 10;
        String str1 = num1 +"";
        float f1 = 12.3f;
        System.out.println();
        String s1 = String.valueOf(f1);
        System.out.println(s1);
    }
    @Test
    public void test5(){
        String str1 = "123sd";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);
        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
    @Test
    public void test3(){
        int num1 = 10;
        method(num1);
        boolean b1 = true;
        Boolean b2 = new Boolean(b1);
        Boolean b3 = b1;
        System.out.println(b2);
        System.out.println(b3);
        int num2 = num1;
        System.out.println(num2);
    }
    public void method(Object object){
        System.out.println(object);
    }
    @Test
    public void test2(){
        Integer i1 = new Integer(12);
        int s = i1.intValue();
        System.out.println(i1+1);
        System.out.println(s+1);
        Float f1 = new Float(12.5f);
        System.out.println(f1+1);
        float f2 = f1.floatValue();
        System.out.println(f1+1);
        System.out.println(f2+1);
    }
    @Test
    public void test(){
        int num1 = 10;
        Integer integer = new Integer(num1);
        System.out.println(integer.toString());
        Integer integer1 = new Integer("122");
        System.out.println(integer1.toString());
        System.out.println(integer1);
/*        //报异常
        Integer integer2 = new Integer("122asdsa");
        System.out.println(integer2.toString());*/
        Float f1 = new Float(12.5f);
        System.out.println(f1.toString());
        System.out.println(f1);
        Float f2 = new Float("12.5");
        System.out.println(f1.toString());
        System.out.println(f2);
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("truE");
        Boolean b3 = new Boolean("true123");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }

}
