package concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by z00382545 on 11/7/16.
 */
public class Generator implements Runnable {
    private int id;
    private BlockingQueue queue;

    public Generator(int id, BlockingQueue<Message> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Message msg = new Message(i);
            try {
                System.out.printf("Generator %d generated %d%n", id, msg.getId());
                queue.put(msg);
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            queue.put(new Message(-1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
