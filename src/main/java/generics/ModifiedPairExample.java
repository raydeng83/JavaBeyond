package generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by z00382545 on 11/5/16.
 */
public class ModifiedPairExample {
    public static void main(String[] args) {
        ModifiedPair<Integer, String> ModifiedPair = new ModifiedPair<>(10, "Test String");
        System.out.println(ModifiedPair);

        ModifiedPair<LocalDate, List<String>> ModifiedPair1 =
                new ModifiedPair<>(LocalDate.now(), Arrays.asList("a", "b", "c"));
        System.out.println(ModifiedPair1);
    }
}
