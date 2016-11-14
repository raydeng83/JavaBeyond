package concurrency.lock;

public class SyncCounter {
    private int count;

    public synchronized void increment() {
        count++;
    }

//    public void increment2() {
//        synchronized (this) {
//            count++;
//        }
//    }

    public synchronized int getCount() {
        return count;
    }
}
