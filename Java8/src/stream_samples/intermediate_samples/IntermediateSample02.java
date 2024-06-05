package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample02 {
    public static void main(String[] args) {
        List.of(0,1,2,3,4,5,6,7,8,9) //source
                .stream()
                .filter(i -> (i % 2 == 0)) //intermediate
                .map(i -> i * 3) //intermediate
                .forEach(System.out::println ); //terminal
    }
}
