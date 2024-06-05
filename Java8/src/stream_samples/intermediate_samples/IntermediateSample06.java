package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample06 {
    public static void main(String[] args) {
        List.of("Utku","Java", "Çolak", "", "Java", "JAva").stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
