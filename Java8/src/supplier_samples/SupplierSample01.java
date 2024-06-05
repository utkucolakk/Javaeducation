package supplier_samples;

import java.util.function.Supplier;

public class SupplierSample01 {
    public static void main(String[] args) {
        Supplier<String> supplier01 = () -> "Supplier Sample";
        System.out.println(supplier01.get());
    }

}
