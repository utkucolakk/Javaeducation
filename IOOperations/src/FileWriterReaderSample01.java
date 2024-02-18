import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderSample01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("first_file.txt"); // "first_file.txt" , true -> default değeri false'dur.
            fileWriter.write("merhaba file");
            fileWriter.write("abc  ");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("nextlinee");
            fileWriter.write("\n");
            fileWriter.write("hahaha");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }

        }
    }
