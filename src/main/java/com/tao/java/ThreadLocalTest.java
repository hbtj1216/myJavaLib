package com.tao.java;

/**
 * Created by michael on 17-8-21.
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadLocal的使用例子.
 */
public class ThreadLocalTest {

    public static void main(String[] args) throws InterruptedException {

        int nThreads = 10;
        final Counter counter = new Counter();

        ExecutorService exc = Executors.newFixedThreadPool(nThreads);
        final CountDownLatch countDownLatch = new CountDownLatch(nThreads);

        for(int i = 0; i < nThreads; i++) {
            exc.submit(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0; i < 10000; i++) {
                        counter.increase();
                    }
                    countDownLatch.countDown();
                }
            });
        }

        countDownLatch.await();
        System.out.println("Expected:" + nThreads * 10000 + ",Actual:" + counter.getCount());
    }

}


class Counter {

    private int count = 0;

    public synchronized void increase() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}


