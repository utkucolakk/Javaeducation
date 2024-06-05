package optional_samples;

import java.util.Optional;

public class OptionalSample06 {
    public static void main(String[] args) {
        Optional<Double> opt = Optional.empty();

        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(Math::random));
        System.out.println(opt.orElseThrow(IllegalAccessError::new));
    }
}
