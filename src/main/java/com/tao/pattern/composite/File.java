package com.tao.pattern.composite;

/**
 * Created by michael on 17-8-7.
 */

/**
 * 文件抽象类。
 * 所有类型的文件或者文件夹都必须继承它。
 */
public abstract class File {

    protected String name;

    public File(String name) {
        this.name = name;
    }


    public abstract void display();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}







