package concurrency.blockingqueue;

/**
 * Created by z00382545 on 11/7/16.
 */
public class Message {
    private final int id;

    public Message(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
