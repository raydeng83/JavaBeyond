package generics;

/**
 * Created by z00382545 on 11/5/16.
 */
public class PairExample {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair);
        pair = pair.swap();
        System.out.println(pair);

        Pair<Integer> pair1 = new Pair<>(3, 4);
        System.out.println(pair1);
        Pair.swap(pair1);
        System.out.println(pair1);

        Pair.<Integer>swap(pair1);
        System.out.println(pair1);
    }
}
