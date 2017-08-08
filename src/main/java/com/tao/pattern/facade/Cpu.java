package com.tao.pattern.facade;

/**
 * Created by Michael on 2017/8/8.
 */

/**
 * CPU类
 */
public class Cpu {

    public void start() {
        System.out.println("启动CPU...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutDown() {
        System.out.println("关闭CPU...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
