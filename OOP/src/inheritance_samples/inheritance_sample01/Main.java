package inheritance_samples.inheritance_sample01;

import jdk.jshell.SnippetEvent;

public class Main {

    public static void main(String[] args) {

        Dog kirli = new Dog();
        kirli.setReptile(false);
        kirli.run();
        kirli.setName("kirli");
        System.out.println("benim adım : " + kirli.getName());
        System.out.println("kirli isReptile : " + kirli.isReptile());
        kirli.eat();
        kirli.see();


        Cat pisi = new Cat();
        pisi.setReptile(false);
        pisi.jump();
        pisi.setName("pisi");
        System.out.println("benim adım : " + pisi.getName());
        System.out.println("pisi isReptile : " + pisi.isReptile());
        pisi.see();

        Snake yilans = new Snake();
        yilans.setReptile(true);
        yilans.crawl();
        yilans.setName("yilans");
        System.out.println("benim adım : " + yilans.getName());
        System.out.println("yilans isReptile : " + yilans.isReptile());
        yilans.see();

        Bat batman = new Bat();
        batman.setReptile(false);
        batman.setName("batman");
        System.out.println("benim adım : " + batman.getName());
        batman.see();
    }
}
