package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample11 {
    public static void main(String[] args) {
        List.of("brown-", "bear-", "bee-").stream()
                .sorted().forEach(System.out::println);
    }
}
