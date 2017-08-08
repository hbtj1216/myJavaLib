package com.tao.pattern.composite;

/**
 * Created by michael on 17-8-7.
 */

/**
 * 视频文件
 */
public class VideoFIle extends File {

    public VideoFIle(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是视频文件, 文件名：" + name);
    }
}
