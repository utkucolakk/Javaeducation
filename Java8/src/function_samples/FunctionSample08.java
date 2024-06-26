package function_samples;

import java.util.function.Function;

public class FunctionSample08 {

    public static void main(String[] args) {
        Function<String, Integer> calculateLength = String::length;

        Function<Integer, Integer> square = number -> number * number;

        Function<String, Integer> combinedFunction = calculateLength.andThen(square);

        String text = "Java Programming";
        int result = combinedFunction.apply(text);
        System.out.println("result : " + result);
    }
}
