package memory_model;

public class ImmutableSample01 {

    public static void main(String[] args) {

        // Java Memory Immutable
<<<<<<< HEAD
        String x = "Java ";
        System.out.println("ilk hali " + x);
        x = x.concat("Rules"); //x + "Rules";
        System.out.println("son hali : " + x);
=======

        String x = "java";
        System.out.println("ilk hali " + x);
        x = x.concat("Rules"); //x+ Rules;
        System.out.println("Son hali " + x);
>>>>>>> d664b2b42200095358b025b0e7b75dd8dc32c56a
        x = x.toUpperCase();
        System.out.println(x);

        System.out.println();
    }
}
