package class_samples.class_sample01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Dog dogOfEray = new Dog();  // class new ile oluşturulduğunda, -> heap(yığın) alanında bu bilgiler tutulur.
        dogOfEray.name = "bulut";
        dogOfEray.gender = "male";
        dogOfEray.age = 1;
        dogOfEray.eyesColor = "black";

        System.out.println("Köpeğimizin adı : " + dogOfEray.name);
        System.out.println("Köpeğimizin göz rengi : " + dogOfEray.eyesColor);
        System.out.println("Köpeğimizin cinsiyeti : " + dogOfEray.gender);
        System.out.println("Köpeğimizin yaşı : " + dogOfEray.age);

        System.out.println();

        Dog dogofGalip = new Dog();
        dogofGalip.name = "hera";
        dogofGalip.gender = "female";
        dogofGalip.age = 1;
        dogofGalip.eyesColor = "yellow";

        System.out.println("Köpeğimizin adı : " + dogofGalip.name);
        System.out.println("Köpeğimizin göz rengi : " + dogofGalip.eyesColor);
        System.out.println("Köpeğimizin cinsiyeti : " + dogofGalip.gender);
        System.out.println("Köpeğimizin yaşı : " + dogofGalip.age);
        dogofGalip.bark();
        dogofGalip.eat();

        }
    }
