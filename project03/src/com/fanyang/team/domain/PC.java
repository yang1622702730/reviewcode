package com.fanyang.team.domain;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:19
 */
public class PC implements Equipment{
    private String model; //表示机器的型号
    private String display; //表示显示器名称

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
    public PC(String model,String display){
        this.display = display;
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "PC{" +
                "model='" + model + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
