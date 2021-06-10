package com.fanyang.team.service;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:16
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -33875169124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
