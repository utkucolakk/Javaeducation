package parallel_stream_samples;

import java.util.Arrays;

public class ParallelStreamSample13 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("w", "o", "l", "f").stream().reduce("X", String::concat));
        System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("X", String::concat));
    }
}
