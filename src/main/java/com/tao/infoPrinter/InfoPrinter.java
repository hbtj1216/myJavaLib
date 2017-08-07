package com.tao.infoPrinter;

/**
 * Created by michael on 17-8-7.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * 信息输出类.
 * 负责输出信息.
 * 开启单线程, 不断的检测阻塞队列, 从头部取出info打印.
 */
public class InfoPrinter {

    public static final boolean ACTIVE = true;

    private static final SimpleDateFormat DATA_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    private static BlockingQueue<String> printQueue = new LinkedBlockingDeque<>();
    private static ExecutorService threadPool;

    static {
        //创建单线程的线程池, 不断从阻塞队列中取出任务
        threadPool = Executors.newSingleThreadExecutor();
        threadPool.execute(new Runnable() {
            @Override
            public void run() {

                try {
                    for(;;) {
                        //从阻塞队列中取出信息
                        String info = printQueue.take();
                        Date date = new Date();
                        System.out.println("[" + DATA_FORMAT.format(date) + "]:" + info);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }


    public static void println(String info) {
        if(!ACTIVE) {
            return;
        }
        //向阻塞队列中添加一条将要打印的信息
        printQueue.add(info);
    }


    public static void exit() {
        if(!ACTIVE) {
            return;
        }
        //关闭线程池
        threadPool.shutdownNow();
    }



    public static void main(String[] args) {

        InfoPrinter.println("测试一下");
    }

}

