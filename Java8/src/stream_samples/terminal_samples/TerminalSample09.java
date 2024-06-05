package stream_samples.terminal_samples;

import java.util.List;

public class TerminalSample09 {
    public static void main(String[] args) {
        StringBuilder word = List.of("w", "o", "l", "f").stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);
    }
}
