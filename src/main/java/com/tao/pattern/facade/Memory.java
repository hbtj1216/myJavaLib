package com.tao.pattern.facade;

/**
 * Created by Michael on 2017/8/8.
 */

/**
 * 内存类
 */
public class Memory {

    public void start() {
        System.out.println("启动内存...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutDown() {
        System.out.println("关闭内存...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
