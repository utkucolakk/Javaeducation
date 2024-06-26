package stream_samples.intermediate_samples;

import java.util.List;

public class IntermediateSample07 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of("1","2", "3", "4", "5", "6").stream()
                .map(Integer::valueOf)
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .filter( e -> e > 30)
                .toList();

        numberList.forEach(System.out::println);
    }
}
