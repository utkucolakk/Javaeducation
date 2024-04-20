package designPatterns.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private AudioSystem audioSystem;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, AudioSystem audioSystem, Projector projector){
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch movie!");
        dvdPlayer.on();
        audioSystem.on();
        projector.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("That's a wrap!");
        dvdPlayer.off();
        audioSystem.off();
        projector.off();
    }

}
