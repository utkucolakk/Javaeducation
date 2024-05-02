package interface_samples.interface_sample04;

public class Main {
    public static void main(String[] args) {
        System.out.println(DataSource.type);
        // DataSource.type = "sdfdsfdsf"; can not be assigned because fields are FINAL in interfaces.
    }
}
