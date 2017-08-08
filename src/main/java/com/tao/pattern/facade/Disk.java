package com.tao.pattern.facade;

/**
 * Created by Michael on 2017/8/8.
 */

/**
 * 硬盘类
 */
public class Disk {

    public void start() {
        System.out.println("启动硬盘...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutDown() {
        System.out.println("关闭硬盘...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
