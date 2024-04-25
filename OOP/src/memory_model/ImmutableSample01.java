package memory_model;

public class ImmutableSample01 {

    public static void main(String[] args) {

        // Java Memory Immutable

        String x = "java";
        System.out.println("ilk hali " + x);
        x = x.concat("Rules"); //x+ Rules;
        System.out.println("Son hali " + x);
        x = x.toUpperCase();
        System.out.println(x);

        System.out.println();
    }
}
