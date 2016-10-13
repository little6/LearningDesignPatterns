package com.agenthun.iterator.example;

/**
 * Created by agenthun on 2016/10/13.
 */
public class Boss extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("老板报销" + money + "元");
    }
}
