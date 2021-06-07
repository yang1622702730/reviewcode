package com.fanyang.study;

/**
 * @program: day10
 * @description:模板方法事例二
 * @author: FanYang
 * @create: 2021-06-02 16:54
 */
public class TemplateTest1 {
    public static void main(String[] args){
        Template3 template3 = new Template3();
        template3.process();
        Template4 template4 = new Template4();
        template4.process();

    }

}
abstract class Template2{
    public void takeNumber(){
        System.out.println("正在取号");
    }
    public abstract void business();//办理的具体业务
    public void assess(){
        System.out.println("对业务进行打分");
    }
    public void process(){
        this.takeNumber();
        this.business();
        this.assess();
    }
}
class Template3 extends Template2{

    @Override
    public void business() {
        System.out.println("业务一");
    }
}
class Template4 extends Template2{

    @Override
    public void business() {
        System.out.println("业务二");
    }
}
