import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CheckedExceptionSample01 {
    public static void main(String[] args) {
        Random random = new Random();

        // handle checked exception
        try {
            FileWriter fileWriter = new FileWriter("doc");
        } catch (IOException e) {
            System.out.println("dosyalama işleminde hata ile karşılaşıldı. " + e.getMessage());
        }

    }

}
