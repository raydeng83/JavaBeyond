package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z00382545 on 11/5/16.
 */
public class CollectionsExample {
    public void noGenerics() {
        List nums = new ArrayList();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add("oops");
        System.out.println(nums);

        for (Object n : nums) {
//             Integer val = (Integer) n;
            System.out.println(n);
        }
    }

    public void genericList() {
        List<Integer> nums = new ArrayList<>();
        nums.add(3); nums.add(1); nums.add(4);
//        nums.add("oops");
        System.out.println(nums);

        nums.forEach(System.out::println);
    }

    public static void main(String[] args) {
        CollectionsExample example = new CollectionsExample();
        example.noGenerics();
        example.genericList();

    }
}
