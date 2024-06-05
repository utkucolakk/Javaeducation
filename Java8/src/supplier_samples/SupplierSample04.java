package supplier_samples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierSample04 {

    /*
   Supplier ile Random methodunu kullanarak, 10 adet 0-99 arası sayı üretiniz, bunlardan >10 olanlarını bir List'eye atınız daha sonrasında ekrana basınız.
    */
    public static void main(String[] args) {
        Stream.of("Java8", "Supplier", "Sample")
                .forEach(name -> {
                    printNames(() -> name);
                });

        List<String> stringList = Stream.generate(SupplierSample04::createNewString)
                .limit(10)
                .toList();
        System.out.println(stringList.size());
    }

    private static String createNewString() {
        return new String();
    }
    private static void printNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
