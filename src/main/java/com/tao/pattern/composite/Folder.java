package com.tao.pattern.composite;

/**
 * Created by michael on 17-8-7.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 */
public class Folder extends File {


    private List<File> files;   //文件夹下的文件列表


    public Folder(String name) {
        super(name);
        this.files = new ArrayList<>();
    }

    @Override
    public void display() {

        for(File file : files) {
            file.display();
        }
    }

    /**
     * 向文件夹中添加文件
     * @param file
     */
    public void add(File file) {
        files.add(file);
    }


    /**
     * 从文件夹中删除文件
     * @param file
     */
    public void remove(File file) {
        files.remove(file);
    }
}
