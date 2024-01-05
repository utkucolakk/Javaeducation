public class LogicalOperators2 {

    public static void main(String[] args) {
        int password = 123456;

        if(password == 12345) {
            System.out.println("şifreniz : 12345");

        }
        if(password == 123456) {
            System.out.println("şifreniz : 123456");
        }


        String name = "bilgeadam";
        if(name.equals("hasan")) {
            System.out.println("Merhaba Hasan!");

        }

        if(name.equals("bilgeadam")) {
            System.out.println("Merhaba bilgeadam!");
        }

        if(name == "bilgeadam") {
            System.out.println("merhaba tekrar bilgeadam!");
        }


        String Ifade = "Örnek değer";
        String Ifade2 = "Örnek değer";
        if (Ifade == Ifade2) {
            System.out.println("Eşit");
        }

    }

}
