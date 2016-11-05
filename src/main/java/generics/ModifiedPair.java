package generics;

/**
 * Created by z00382545 on 11/5/16.
 */
public class ModifiedPair<T,U> {
    private T left;
    private U right;

    public ModifiedPair(T left, U right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public U getRight() {
        return right;
    }

    @Override
    public String toString() {
        return String.format("ModifiedPair {left=%s, right=%s}", left, right);
    }
}
