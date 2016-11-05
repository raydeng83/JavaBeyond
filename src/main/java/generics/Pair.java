package generics;

/**
 * Created by z00382545 on 11/5/16.
 */
public class Pair<T> {
    private T left;
    private T right;

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    public Pair<T> swap() {
        return new Pair<T>(right, left);
    }

    public static <T> void swap(Pair<T> pair) {
        T temp = pair.left;
        pair.left = pair.right;
        pair.right = temp;
    }

    @Override
    public String toString() {
        return String.format("Pair{left=%s, right=%s}", left, right);
    }

}
