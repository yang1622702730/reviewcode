package com.fanyang.study;

/**
 * @program: day10
 * @description:模板方法的实例一
 * @author: FanYang
 * @create: 2021-06-02 16:45
 */
public class TemplateTest {
    public static void main(String[] args){
        Template1 template1 = new Template1();
        template1.time();

}
}

abstract class Template {
    public void time() {
        long start = System.currentTimeMillis();
        this.code();//不确定的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为"+(end-start));
    }
    public abstract void code();
}
class Template1 extends Template{

    @Override
    public void code() {
        for (int i=2;i<1000;i++){
            boolean isFlog = true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    isFlog=false;
                    break;
                }
            }
            if (isFlog){
                System.out.println(i);
            }
        }
    }
}
