package designPatterns.facade;

public class AudioSystem {
    void on(){
        System.out.println("Audio System: ON");
    }
    void off(){
        System.out.println("Audio System: OFF");
    }
    void setVolume(int volume){
        System.out.println("Audio System: Setting volume to "+ volume);
    }
}
