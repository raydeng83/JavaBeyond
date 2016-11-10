package innerclasses;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z00382545 on 11/10/16.
 */
public class StringSortingExample {
    public static void main(String[] args) {
        StringSorter ss = new StringSorter();
        List<String> strings = Arrays.asList("this", "is", "a", "basket", "of", "fruits");
        ss.setStrings(strings);
        System.out.println(strings);
        System.out.println("After sorting:");
        System.out.println(ss.lengthSort());
        System.out.println("After reverse sorting:");
        System.out.println(ss.lengthReverseSortWithStreams());

    }
}
