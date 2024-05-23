package predicate_samples;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample04 {
    public static void main(String[] args) {
        //SORU: List<String> olsun bunun içinde String isimler olsun ve length'i  >4 olan ve baş harfi a olan string'leri filtreleyip ayrı bir List'e
        //atıp onu da ekrana yazalım.

        List<String> myList = List.of("selahattin","utku","öykü","ibrahim","nilgün","çolak");
        List<String> length4buyuk = myList.stream()
                .filter(element -> element.length() > 4 && element.startsWith("u"))
                .toList();
        length4buyuk.forEach(System.out::println);

    }
}