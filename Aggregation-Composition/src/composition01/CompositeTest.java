package composition01;

import aggregation01.Address;

public class CompositeTest {

    public static void main(String[] args) {
        CompositeEmployee compositeEmployee = new CompositeEmployee(1,"bilgeadam", "street1", "city1");
        compositeEmployee = null;
        System.out.println(compositeEmployee);
    }
}
