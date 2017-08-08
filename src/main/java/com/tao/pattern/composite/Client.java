package com.tao.pattern.composite;

/**
 * Created by michael on 17-8-7.
 */
public class Client {

    public static void main(String[] args) {

        //1) 首先建立文件系统(树型结构)
        Folder rootFolder = new Folder("根文件夹");
        //2) 向根文件夹添加三个文件和一个文件夹
        TextFile text1 = new TextFile("a.txt");
        ImageFile img1 = new ImageFile("b.jpg");
        VideoFIle video1 = new VideoFIle("c.rmvb");
        Folder childFolder = new Folder("childFolder");
        //3) 添加到根文件夹下面
        rootFolder.add(text1);
        rootFolder.add(img1);
        rootFolder.add(video1);
        rootFolder.add(childFolder);

        //4) 向childFolder中添加文件
        TextFile c_aText = new TextFile("c_a.txt");
        ImageFile c_bImage = new ImageFile("c_b.png");
        VideoFIle c_cVideo = new VideoFIle("c_c.mp4");
        childFolder.add(c_aText);
        childFolder.add(c_bImage);
        childFolder.add(c_cVideo);

        //5) 遍历rootFolder
        System.out.println("===========遍历rootFolder==========");
        rootFolder.display();

        //6) 遍历childFolder
        System.out.println("===========遍历childFolder==========");
        childFolder.display();

        //7) 删除c_b.png
        childFolder.remove(c_bImage);
        System.out.println("===========删除c_b.png之后==========");
        childFolder.display();

    }
}






