package optional_samples;

import java.util.Optional;

public class OptionalSample04 {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable("      abracadabra    ");
        if(string.isPresent()) {
            string.map(String::trim).ifPresent(System.out::println);
        }
        string.map(String::trim).ifPresent(System.out::println);
    }
}
