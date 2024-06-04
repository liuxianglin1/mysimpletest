package com.company;

import java.util.concurrent.*;

/**
 * @author liuxianglin
 * @datetime 2024/4/22
 * @description
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch doneSignal = new CountDownLatch(3);
        ExecutorService service = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; ++i) {// create and start threads
//        e.execute(new WorkerRunnable(doneSignal, i));
            service.execute(new WorkerRunnable(i));}
//        try {
////            doneSignal.await();      // wait for all to finish
//        } catch (InterruptedException exception) {
//            Thread.currentThread().interrupt();
//        }
        service.shutdown();
        service.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("继续执行主线程的其他任务");
    }


}
