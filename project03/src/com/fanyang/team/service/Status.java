package com.fanyang.team.service;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:39
 */
public class Status {
    private final String NAME;
    Status(String name){
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
