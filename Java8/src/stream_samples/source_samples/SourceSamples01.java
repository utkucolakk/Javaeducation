package stream_samples.source_samples;

import java.util.List;
import java.util.stream.IntStream;

public class SourceSamples01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);

        IntStream.rangeClosed(1,10).map(e -> e * 2).forEach(System.out::println);
    }
}
