package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample04 {
    public static void main(String[] args) {
        List.of("Utku","Java", "Çolak" ,"", "Java","JAva").stream()
                .filter(e -> !e.isEmpty())
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }
}
