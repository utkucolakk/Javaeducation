import javax.xml.stream.events.StartElement;
import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;

        boolean resultAND = number1 > number2 && number1 < 0 && number2 > 0;
        System.out.println(resultAND);

        boolean resultOR = number1 > number2 || number1 < 0 || number2 > 0;
        System.out.println(resultOR);

        //int long double float -> primitive(ilkel)
        String name = "bilgeadam";
        //Scanner scanner = new Scanner(System.in);
        int uzunluk = name.length();
        System.out.println(uzunluk);
        System.out.println(name.contains("a"));


        String telephoneNumber = "05420302015";
        String turkcell = "0532";
        String vodafone = "0542";
        System.out.println(telephoneNumber.startsWith(vodafone));

        if(telephoneNumber.startsWith(vodafone))  {
            System.out.println("hattınız vodafone'dur");
    }
        if(telephoneNumber.startsWith(turkcell)) {
            System.out.println("hattınız turkcell'dir");

        }




    }
}
