package com.fanyang.exercises;

public class SchoolExercise {
    public static void main(String[] args){
        Student student1 = new Student();
        Teacher teacher1 = new Teacher();
        String info=student1.say();
        System.out.println(info);
        teacher1.say();
    }
}

class Student {
    String name = "杨凡";
    int age = 21;
    String major = "软件工程";
    String interests = "听音乐";
    String info ="我的名字是"+name+"，我今年"+age+"岁，我的专业是"+major+"，我的兴趣是"+interests;
    public String say() {
        System.out.println("我的名字是"+name+"，我今年"+age+"岁，我的专业是"+major+"，我的兴趣是"+interests);
        return info;
    }

}
class Teacher{
    String name = "邓宏";
    int age=78;
    int teachAge=60;
    String course = "语文";
    public void say(){
        System.out.println("我的名字是"+name+"，我今年"+age+"岁，我交了"+teachAge+"年书，我教授的课程是"+course);
    }
}
