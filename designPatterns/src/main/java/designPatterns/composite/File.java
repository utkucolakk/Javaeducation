package designPatterns.composite;

public class File implements FileSystem{
    private String name;

    public File(String name){
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("File : "+name);
    }

    @Override
    public void add(FileSystem fileSystem) {
        System.out.println("File : Operation Not Supported");
    }
}
