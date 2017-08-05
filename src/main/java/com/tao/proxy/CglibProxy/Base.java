package com.tao.proxy.CglibProxy;

/**
 * Created by michael on 17-8-5.
 */

/**
 * 假设：UserServiceImpl并没有实现UserService接口
 */
public class Base {

    /**
     * 添加操作
     */
    public void add() {
        System.out.println("Base的对象执行add()操作...");
    }


    /**
     * 删除操作
     */
    public void delete() {
        System.out.println("Base的对象执行delete()操作...");
    }

}
