package designPatterns.facade;

public class Projector {
    void on(){
        System.out.println("Projector : ON");
    }
    void off(){
        System.out.println("Projector : OFF");
    }
    void setInput(String input){
        System.out.println("Projector: Setting input to "+ input);
    }
}
