package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample13 {
    public static void main(String[] args) {
        long count = List.of("k1", "k2", "k3").stream().count();
        System.out.println(count);
    }
}
