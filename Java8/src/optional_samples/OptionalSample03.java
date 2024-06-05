package optional_samples;

import java.util.Optional;

public class OptionalSample03 {
    public static void main(String[] args) {
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println(nullable);
    }
}
