package com.fanyang.exercises;
/*
编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
在另一个StudentTest类中的main方法中，创建Student对象，并访问say方法和所有属性，并将调用结果打印输出。
 */



public class Students {
    String name = "fanYang";
    String gender = "male";
    int age = 21;
    int id = 2018443764;
    double score = 100;

    /**
     * Description 打印基本信息
     * @return
     */
    public String say(){
        return (name+gender+age+id+score);
    }
}
