package concurrency.latch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by z00382545 on 11/8/16.
 */
public class TaskExample {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(5);

        for (int i=0; i<5; i++) {
            new Thread(new Task(i, start, end)).start();
        }

        System.out.println("Work done before starting tasks...");
        start.countDown(); // Go!
        System.out.println("Doing work while tasks are running");
        end.await();
        System.out.println("All tasks finished");
    }
}
