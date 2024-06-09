package parallel_stream_samples;

import java.util.List;

public class ParallelStreamSample02 {
    public static void main(String[] args) {
        List.of("jackal", "kangaroo", "lemur").parallelStream().map(s -> {
            System.out.println(s);
            return s;
        }).forEach(System.out::println);
    }
}
