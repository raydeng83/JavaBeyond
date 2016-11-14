package concurrency;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by z00382545 on 11/7/16.
 */
public class ExecutorsExample {
    public static void main(String[] args) {
        List<RunnableClass> runnableList = Stream.iterate(0, n -> n + 1)
                .map(RunnableClass::new).limit(10).collect(Collectors.toList());

        ExecutorService service = Executors.newCachedThreadPool();
        runnableList.forEach(service::execute);

        for (RunnableClass mr : runnableList) {
            service.execute(mr);
        }

        service.shutdown();
    }
}
