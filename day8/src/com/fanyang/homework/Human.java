package com.fanyang.homework;

/*写一个人的类
      属性：名字，性别，年龄；提供无参的构造器和一个有参的构造器
      方法：（1）自我介绍的方法（2）吃饭的方法
      创建一个对象“张三”
*/


public class Human {
     String name;
     char gender;
     int age;
     public Human(String name,char gender,int age){
         System.out.println("有参的构造器初始化完成");
         this.name = name;
         this.gender = gender;
         this.age = age;
     }
     public Human(){
         System.out.println("无参的构造器初始化完成");
     }

    /**
     * Description 自我介绍
     */
    public void selfIntroduction(){
         System.out.println(name+","+gender+","+age);
     }

    /**
     * Description 吃饭
     */
    public void eat(){
         System.out.println("我正在吃饭");
     }
}
