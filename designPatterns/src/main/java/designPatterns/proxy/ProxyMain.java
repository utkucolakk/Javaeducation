package designPatterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        //Using Real OBject
        Image realImage = new RealImage("realImage.jpg");
        realImage.display();

        //Using Proxy
        Image proxyImage = new ProxyImage("realImage.jpg");
        proxyImage.display();
    }
}
