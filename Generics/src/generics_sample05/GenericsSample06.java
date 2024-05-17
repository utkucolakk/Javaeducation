package generics_sample05;

public class GenericsSample06 {

    public static void main(String[] args) {
        // GenericClass2<String> obj = new GenericClass2<>(); ERROR
        GenericsClass2<Integer> obj2 = new GenericsClass2<>();
        GenericsClass2<Double> obj3 = new GenericsClass2<>();
        GenericsClass2<Long> obj4 = new GenericsClass2<>();
        GenericsClass2<Float> obj5 = new GenericsClass2<>();
        // GenericClass2<Boolean> obj6 = new GenericsClass2<>();
    }


}
