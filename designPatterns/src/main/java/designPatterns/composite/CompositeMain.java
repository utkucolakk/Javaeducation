package designPatterns.composite;

public class CompositeMain {
    public static void main(String[] args) {
        //Client
        File file1 = new File("Document1.txt");
        File file2 = new File("Image1.jpeg");

        Directory root = new Directory("Root");
        Directory subDirectory = new Directory("SubFolder");

        root.add(file1);
        root.add(subDirectory);
        subDirectory.add(file2);

        root.display();

    }
}
