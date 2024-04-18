public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        if (cashToWithdrawal > getCashInAccount()) {

            System.out.println("Hata: Yeterli paranız bulunmamakta.");
            System.out.println("Güncel Bakiye: " + getCashInAccount());

            return false;
        }else {

            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Para çekme işlemi tamamlandı: Güncel Bakiye " + getCashInAccount());
        return true;
        }
    }
    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);

        System.out.println("Para yatırma işlemi tamamlandı: Güncel Bakiye " + getCashInAccount());
    }
}
