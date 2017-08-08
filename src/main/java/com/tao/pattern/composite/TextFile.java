package com.tao.pattern.composite;

/**
 * Created by michael on 17-8-7.
 */

/**
 * 文本文件
 */
public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件, 文件名：" + name);
    }
}
