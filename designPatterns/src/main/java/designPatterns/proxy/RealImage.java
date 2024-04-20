package designPatterns.proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    public void loadImageFromDisk(){
        System.out.println("Loading Image from disk : "+ fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image : "+fileName);
    }
}
