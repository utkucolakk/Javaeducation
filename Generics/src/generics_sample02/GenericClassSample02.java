package generics_sample02;

public class GenericClassSample02 {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("hello");

        System.out.println("Message : " + stringBox.getItem());


        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(14);
        System.out.println("Message : " + integerBox.getItem());
    }
}
