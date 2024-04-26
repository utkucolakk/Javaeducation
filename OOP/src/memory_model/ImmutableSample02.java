package memory_model;

public class ImmutableSample02 {
    public static void main(String[] args) {

<<<<<<< HEAD

        String name1 = "bilgeadam";

        String name2 = new String("bilgeadam");

        if (name1.equals(name2)) {
            System.out.println("aynı değer");
        }

    }
}


 
=======
        String name1 = "bilgeadam";

        String name2 = "bilgeadam";

        if (name1 == name2) {
            System.out.println("aynı değer");
        } else {
            System.out.println("aynı değer değildir");
        }
    }

}
>>>>>>> d664b2b42200095358b025b0e7b75dd8dc32c56a
