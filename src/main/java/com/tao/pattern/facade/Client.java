package com.tao.pattern.facade;

/**
 * Created by Michael on 2017/8/8.
 */

/**
 * 客户角色
 */
public class Client {

    public static void main(String[] args) throws Exception {

        Computer computer = new Computer();
        computer.start();
        Thread.sleep(3000);
        computer.shutDown();
    }
}
