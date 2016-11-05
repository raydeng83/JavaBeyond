package oop;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class BooleanArrayExample {
    private boolean[] numbers = new boolean[200];

    public void add(int num) {
        numbers[num] = true;
    }

    public boolean isAdded (int num) {
        return numbers[num];
    }

    public static void main(String[] args) {
        BooleanArrayExample ba = new BooleanArrayExample();
        System.out.println(ba.isAdded(2));
        ba.add(2);
        System.out.println(ba.isAdded(2));
    }
}
