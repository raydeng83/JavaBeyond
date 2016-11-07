package concurrency;

/**
 * Created by z00382545 on 11/7/16.
 */
public class ThreadClass extends Thread {
    private int id;

    public ThreadClass(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("This is a running thread from " + this);
    }

    @Override
    public String toString() {
        return String.format("Thread Class {id=%d}", id);
    }
}
