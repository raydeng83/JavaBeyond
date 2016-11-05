package interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by z00382545 on 11/5/16.
 */
public class DefaultMethodExample {
    public static void main(String[] args) {
        List<Integer> nums = Stream.of(5, 19, -12, -1, 11, -5, 10, 34)
                .collect(Collectors.toList());
        System.out.println(nums);

        boolean removed = nums.removeIf(n -> n <= 0);
        System.out.println("Elements were " + (removed ? "" : "NOT") + "removed");
        System.out.println(nums);

        nums.forEach(System.out::println);
    }
}
