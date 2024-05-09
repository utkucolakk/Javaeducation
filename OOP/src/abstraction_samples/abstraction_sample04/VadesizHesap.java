package abstraction_samples.abstraction_sample04;

 class VadesizHesap extends Hesap{

    public VadesizHesap(String hesapNo) {
        super(hesapNo);
    }
    @Override
    public void paraCek(double miktar) {
        if (miktar <= getBakiye()) {
            paraYatir(-miktar);
            System.out.println(miktar + "TL çekildi.");
        }else {
            System.out.println("Yetersiz Bakiye");
        }

    }
}

