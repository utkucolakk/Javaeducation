

//bir hesap numarasının aktif olup olmadığını kontrol
// eden basit bir hesap numarası kontrol mekanizması sunar.






public class AccountNumberCheck  {

    public static void main(String[] args) {
        int acctNumToCheck = 12345678; // Test için bir hesap numarası
        System.out.println("Aktif Hesap: " + accountActive(acctNumToCheck));
    }

    public static int getAccountNumber() {
        int accountNumber = 12345678;
        return accountNumber;
    }


    public static boolean accountActive(int acctNumToCheck) {
        return acctNumToCheck == getAccountNumber();
    }
}
