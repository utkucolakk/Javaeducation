package stream_samples.terminal_samples;

import java.util.List;

public class TerminalSample07 {
    public static void main(String[] args) {
        List<String> list1 = List.of("w", "o", "l", "f");
        String text = list1.stream().reduce("X", (a,b) -> a + b + "--");
        System.out.println(text);
    }
}
