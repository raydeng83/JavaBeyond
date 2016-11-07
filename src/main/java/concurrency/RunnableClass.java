package concurrency;

/**
 * Created by z00382545 on 11/7/16.
 */
public class RunnableClass implements Runnable {
    private int id;
    private Thread thread = new Thread(this);

    public RunnableClass(int id) {
        this.id = id;
    }


    @Override
    public void run() {
        System.out.println("This is a running thread from " + this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public String toString() {
        return String.format("Runnable Class {id=%d}", id);
    }

}
