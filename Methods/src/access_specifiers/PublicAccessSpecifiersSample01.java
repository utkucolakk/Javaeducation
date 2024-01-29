package access_specifiers;

import static_methods.StaticMethodSample02;

import java.util.Random;

public class PublicAccessSpecifiersSample01 {

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50); // java.util paketindeki nextInt methoduna erişebildim.

        StaticMethodSample02 staticMethodSample02 = new StaticMethodSample02();
        staticMethodSample02.topla(5,10);

        StaticMethodSample02.cikar(15, 5);



        PrivateMethodSample01 privateMethodSample01 = new PrivateMethodSample01();
        // privateMethodSample01.topla(3,5);
         // erişemeyiz çünkü PrivateMethodSample01 cllasındaki privatre topla methodu
         // sadece ve sadece aynı class içerisinde erişilir.


        DefaultMethodSample01 defaultMethodSample01 = new DefaultMethodSample01();
        defaultMethodSample01.topla(4,9);
     }
}
