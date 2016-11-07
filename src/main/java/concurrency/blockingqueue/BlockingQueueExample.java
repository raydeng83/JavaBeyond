package concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by z00382545 on 11/7/16.
 */
public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
        Generator p1 = new Generator(1, queue);
        Generator p2 = new Generator(2, queue);
        Consumer c1 = new Consumer(1, queue);
        Consumer c2 = new Consumer(2, queue);

        ExecutorService service = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());
        service.execute(p1);
        service.execute(p2);
        service.execute(c1);
        service.execute(c2);
        service.shutdown();
    }
}
