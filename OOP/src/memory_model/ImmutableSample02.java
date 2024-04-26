package memory_model;

public class ImmutableSample02 {
    public static void main(String[] args) {


        String name1 = "bilgeadam";

        String name2 = new String("bilgeadam");

        if (name1.equals(name2)) {
            System.out.println("aynı değer");
        }

    }
}


 