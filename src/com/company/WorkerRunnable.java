package com.company;

import java.util.concurrent.CountDownLatch;

/**
 * @author liuxianglin
 * @datetime 2024/4/22
 * @description
 */
public class WorkerRunnable implements Runnable {

//    private final CountDownLatch doneSignal;
    private final int i;
    public WorkerRunnable(CountDownLatch doneSignal, int i) {
//        this.doneSignal = doneSignal;
        this.i = i;
    }

    public WorkerRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        doWork(i);
//        doneSignal.countDown();
    }

    void doWork(int i) {
        System.out.println(i + "=================" + i);
    }
}
