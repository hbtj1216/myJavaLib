package com.tao.pattern.facade;

/**
 * Created by Michael on 2017/8/8.
 */

/**
 * Computer类, 作为外观模式中的门面角色.
 */
public class Computer {

    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void start() {
        System.out.println("开始启动电脑...");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("电脑启动完毕!");
        System.out.println();
    }

    public void shutDown() {
        System.out.println("开始关闭电脑...");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("电脑关闭完毕!");
    }
}
