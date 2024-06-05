package supplier_samples;

import java.util.Optional;

public class SupplierSample06 {
    public static void main(String[] args) {
        String name = findNameById(1L).orElseGet(() -> "static name");
        System.out.println(name);
    }

    private static Optional<String> findNameById(Long id) {
        String name = null;
        if(id == 1) {
            name = "java8";
        }

        return Optional.ofNullable(name);
    }
}
