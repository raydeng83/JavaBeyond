package concurrency.lock;

public class Counter {
    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
