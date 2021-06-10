package com.fanyang.exception.exercise1;


/*
编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
        对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
        除O(ArithmeticException)及输入负数(EcDef自定义的异常)进行异常处理。
*/

/**
 * @program: day11
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 11:23
 */
public class EcmDef {
    public static void main(String args[]){
        try {
            double result = division(1,0);
            System.out.println(result);
        }
        catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除O");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

    }
    public static double division(int i,int j) throws MyException{
        if (i<0||j<0){
            throw new MyException("不能为负数");
        }
        return i/j;
    }
}
