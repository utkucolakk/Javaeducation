public class IfElse {

    public static void main(String[] args) {
        String username = "bilgeadam";
        String password = "!bilgeadam";

        if(username.equals("bilgeadam") && password.equals("!bilgeadam")) {
            System.out.println("Hoş geldin bilgeadam!");
        } else {
            System.out.println("kullanıcı adı veya şifreniz yanlış girilmiştir.!");
        }

        System.out.println("işlem sonu");
    }
}
