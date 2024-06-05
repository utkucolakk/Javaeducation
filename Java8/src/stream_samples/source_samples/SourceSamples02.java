package stream_samples.source_samples;

import java.util.stream.IntStream;

public class SourceSamples02 {
    public static void main(String[] args) {
        IntStream.iterate(10, i -> i+5)
                .limit(6)
                .forEach(System.out::println);
    }
}
