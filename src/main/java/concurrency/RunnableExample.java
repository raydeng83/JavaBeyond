package concurrency;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by z00382545 on 11/7/16.
 */
public class RunnableExample {
    public static void main(String[] args) {
        List<RunnableClass> threadList = Stream.iterate(0, n -> n+1)
                .map(RunnableClass::new).limit(10).collect(Collectors.toList());
        threadList.forEach(RunnableClass::start);
    }
}
