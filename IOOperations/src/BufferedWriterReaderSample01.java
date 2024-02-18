import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderSample01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("buffered_writer.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hello");
        bufferedWriter.write("world");
        bufferedWriter.newLine();
        bufferedWriter.write("java");
        bufferedWriter.close();
    }
}
