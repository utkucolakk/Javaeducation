package supplier_samples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierSample03 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    public static void main(String[] args) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        System.out.println(supplier02.get());

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        System.out.println(supplier03.get());
    }
}
