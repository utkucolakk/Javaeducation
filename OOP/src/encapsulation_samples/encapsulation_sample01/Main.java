package encapsulation_samples.encapsulation_sample01;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setBudget(500);
        customer.setId(1);
        customer.setGender("female");
        customer.setPassword("123456");

        System.out.println(customer.getBudget());
        System.out.println(customer.getGender());


    }
}
