package com.tao.pattern.composite;

/**
 * Created by michael on 17-8-7.
 */

/**
 * 图像文件
 */
public class ImageFile extends File {

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件, 文件名：" + name);
    }
}
