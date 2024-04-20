package designPatterns.facade;

public class DVDPlayer {
    void on(){
        System.out.println("DVD Player ON");
    }
    void off(){
        System.out.println("DVD Player OFF");
    }
    void play(String movie){
        System.out.println("DVD Player : Playing "+movie);
    }
}
