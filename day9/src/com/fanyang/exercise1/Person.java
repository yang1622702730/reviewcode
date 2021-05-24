package com.fanyang.exercise1;

/**
 * @program: day9
 * @description: person的相关操作
 * @author: FanYang
 * @create: 2021-05-24 16:08
 */
public class Person {
    private String name;
    private String address;
    private String telPhone;
    private String emile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        this.emile = emile;
    }

    public Person(String name, String address, String telPhone, String emile) {
        this.name = name;
        this.address = address;
        this.telPhone = telPhone;
        this.emile = emile;
    }
    public Person(){}
}
