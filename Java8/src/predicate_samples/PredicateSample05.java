package predicate_samples;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample05 {
    public static void main(String[] args) {
        Predicate<String> nullCheckPredicate = e -> e.startsWith("u");
        Predicate<String> lengthCheckPredicate = e -> e.length() > 2;

        //predicate'leri birleştir
        Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);

        List<String> myList = List.of("selahattin","utku","öykü","ibrahim","nilgün","çolak","a ");
        List<String> filteredList = myList.stream().filter(andPredicate).toList();
        System.out.println(filteredList);

        String temp1 = null;
        String temp2 = "java8";
        String temp3 = "utku";
        String temp4 = "aab";
        System.out.println(andPredicate.test(temp2));
        System.out.println(andPredicate.test(temp4));
    }
}