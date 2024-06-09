package parallel_stream_samples;

import java.util.Arrays;

public class ParallelStreamSample08 {
    public static void main(String[] args) {
        Arrays.asList(1, 5, 20, 4, 3, 8, 100)
                .stream()
                .unordered()
                .parallel()
                .forEach(System.out::println);
    }
}
