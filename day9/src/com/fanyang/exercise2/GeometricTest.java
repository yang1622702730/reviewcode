package com.fanyang.exercise2;

/**
 * @program: day9
 * @description: 测试类
 * @author: FanYang
 * @create: 2021-05-25 16:13
 */
public class GeometricTest {
    public static void main(String[] args){
        GeometricTest geometricTest = new GeometricTest();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setRadius(1);
        circle2.setRadius(2);
//        System.out.println(circle1.getColor());
        geometricTest.equalArea(circle1,circle2);
        geometricTest.displayGeometricObject(circle1);
        geometricTest.displayGeometricObject(circle2);
        MyRectangle myRectangle = new MyRectangle(2,2,"sad",21);
        geometricTest.displayGeometricObject(myRectangle);

    }
    public boolean equalArea(GeometricObject geometricObject1,GeometricObject geometricObject2){
        if (geometricObject1.findArea() == geometricObject2.findArea()){
            System.out.println("面积完全相同");
            return true;
        }
        else {
            System.out.println("面积不同");
            return false;
        }
    }
    public void displayGeometricObject(GeometricObject geometricObject){
        double area = geometricObject.findArea();
        System.out.println("area = "+area);
    }
}
