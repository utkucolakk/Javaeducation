package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample03 {
    public static void main(String[] args) {
        List.of("Utku", "Çolak" ,"", "Java").stream()
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);
    }
}
