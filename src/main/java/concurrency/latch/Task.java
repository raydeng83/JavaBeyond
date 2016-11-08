package concurrency.latch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by z00382545 on 11/8/16.
 */
public class Task implements Runnable {

    private int id;
    private CountDownLatch start;
    private CountDownLatch end;

    public Task (int id, CountDownLatch start, CountDownLatch end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.printf("%d waiting to start ... %n", id);
        try {
            start.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%d running to completion %n", id);
        end.countDown();
    }
}
