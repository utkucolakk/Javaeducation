package class_samples.class_sample03;

public class Account {

    long id;
    double budget;
    String name;
    String password;
    String gender;


    public void withdraw(int cash) {
        if(budget >= cash) {
           budget = budget - cash;
            System.out.println("İlk önce kartınızı daha sonra paranızı alınız.");
        }else {
            throw new RuntimeException("Hesapta istenilen miktar yok.");
        }

    }

    public void deposit(int cash) {
        budget = budget + cash;

    }
}
