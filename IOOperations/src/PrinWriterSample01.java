import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrinWriterSample01 {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("print_writer.txt");
            printWriter.println("hello");
            printWriter.println("world");
            printWriter.println();
            printWriter.println("java");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            printWriter.close();
        }

    }
}
