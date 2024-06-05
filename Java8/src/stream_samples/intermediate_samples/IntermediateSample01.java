package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample01 {
    public static void main(String[] args) {
        List<String> result = List.of("one", "two", "three", "four").stream()
                .filter( e-> e.length() > 3)
                .peek(e -> System.out.println("Filtered value : " +e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value : " +e))
                .toList();
    }
}
