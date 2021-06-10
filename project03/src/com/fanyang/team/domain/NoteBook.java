package com.fanyang.team.domain;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:20
 */
public class NoteBook implements Equipment{
    private String model; //表示机器的型号
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public NoteBook(String model,double price){
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "NoteBook{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
