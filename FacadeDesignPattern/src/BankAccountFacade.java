public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;      //Hesap numarası kontrolü, güvenlik kodu kontrolü ve
                                       //bakiye kontrolü işlemlerini gerçekleştiren sınıfların örnekleri.
    FundsCheck fundChecker;

    WelcomeToBank bankWelcome;       //Banka uygulamasına hoş geldiniz mesajını sağlayar

    public BankAccountFacade(int newAcctNum, int newSecCode) {

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }

    public  int getAccountNumber() {
        return accountNumber;
    }
    public  int getSecurityCode() {
        return  securityCode;
    }

    public void withdrawCash(double cashToGet){
        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&   //Bu yöntem, hesabın aktif olup olmadığını,
                                                                 //güvenlik kodunun doğru olup olmadığını ve
                                                                //yeterli paranın olup olmadığını kontrol eder.
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("İşlem Tamamlandı.");
        }else {
            System.out.println("İşlem Tamamlanamadı.");
        }

    }

    public void depositCash(double cashToDeposit){
        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("İşlem Tamamlandı.");
        }else {
            System.out.println("İşlem Tamamlanamadı.");
        }
        }
    }

// welcomeToBank'ı burda yazdırmak mı daha mantıklı??