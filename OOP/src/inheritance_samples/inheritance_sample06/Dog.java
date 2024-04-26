package inheritance_samples.inheritance_sample06;

import inheritance_samples.inheritance_sample05.Animal;

public class Dog extends Animal {


    public Dog(String name) {
        this.name = name; // Animal classı içersindeki name field'ı protected olduğu için sadece extends edilen classtan ulaşabilirim
    }

    public void getInfo() {
        System.out.println("My name is " + name);
    }

   public void displaySomething() {
       super.display();
   }

}
