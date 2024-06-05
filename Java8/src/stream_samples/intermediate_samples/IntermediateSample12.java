package stream_samples.intermediate_samples;

import java.util.stream.Stream;

public class IntermediateSample12 {
    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
