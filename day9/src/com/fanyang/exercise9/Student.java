package com.fanyang.exercise9;

/**
 * @program: day9
 * @description: Student的操作
 * @author: FanYang
 * @create: 2021-05-27 20:13
 */
public class Student extends Person {
    private int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, int age, char gender, int id) {
        super(name, age, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
       if (this ==obj){
           return true;
       }
       if (obj instanceof Student){
           Student student = (Student)obj;
           return this.id ==student.getId() &&this.getName().equals(student.getName());
       }
       return false;
    }

}
