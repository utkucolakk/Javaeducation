package consumer_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample04 {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("eda", 100));
        productList.add(new Product("utku", 200));
        productList.add(new Product("serdar", 300));
        productList.add(new Product("feyzan", 500));

        Consumer<Product> printProductInfo = product -> {
            System.out.println("Product : " + product.getName() + ", Price $ " + product.getPrice());
        };

        productList.forEach(printProductInfo);
    }
}
