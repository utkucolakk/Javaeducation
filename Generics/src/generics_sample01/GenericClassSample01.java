package generics_sample01;

public class GenericClassSample01 {


    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5); //generic
        // List<Integer> -> generic

        intObj.getData();

        GenericClass<String> stringObj = new GenericClass<>("hello");
        stringObj.getData();

    }
}
