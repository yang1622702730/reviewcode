package com.fanyang.team.domain;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:20
 */
public class Printer implements Equipment{
    private String name;
    private String type; //表示机器的类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Printer(String name,String type){
        this.name = name;
        this.type = type;
    }


    @Override
    public String getDescription() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
