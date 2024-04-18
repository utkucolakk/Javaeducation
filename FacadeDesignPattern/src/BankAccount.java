
//Facade tasarım deseni, bir yazılım bileşeninin karmaşıklığını gizleyerek kullanımını kolaylaştırır
// Bu desen sayesinde, birden fazla alt sistemle uğraşmak yerine tek bir
// arayüz üzerinden işlemler yapabiliriz. Facade sınıfı, alt sistemlerin detaylarını gizler
// ve istemci kodunun daha basit ve bağımsız olmasını sağlar. Bu da sistemde değişiklik yapmayı
// ve bakımı daha kolay hale getirir. Büyük ve karmaşık sistemlerde özellikle kullanışlı olan bu desen,
// karmaşıklığı kontrol altında tutar ve istemci kodunun bu karmaşıklığa doğrudan erişimini önler.


//Basitleştirme: Facade, basitleştirilmiş tek bir arayüz sağlayarak karmaşık sistemlerle etkileşimi basitleştirir.
//Ayrıştırma: Alt sistemleri istemcilerden ve diğer alt sistemlerden ayırarak alt sistemin bağımsızlığını ve taşınabilirliğini destekler.
//Yönetilebilirlik: Facade, kodun okunabilirliğini ve yönetilebilirliğini geliştirerek genel yazılımın sürdürülebilirliğini artırır.


//Facade modeli aşağıdaki senaryolarda faydalıdır:

//Bir sistem çok karmaşık veya anlaşılması zordur.
//Her alt sistem için bir giriş noktasına ihtiyaç vardır.
//Alt sistemlerinizi katmanlandırmaya ihtiyaç vardır.


public class BankAccount {
    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(900.00);
        accessingBank.depositCash(200.00);
        accessingBank.withdrawCash(300.00);



    }
}