package map_sample;

import java.util.*;

public class HashMapSample01 {

    public static void main(String[] args) {
        Map<String, List<String>> countryCityMap = new HashMap<>();

        List<String> cityListOfTR = new LinkedList<>();
        cityListOfTR.add("ankara");
        cityListOfTR.add("eskisehir");
        cityListOfTR.add("istanbul");
        cityListOfTR.add("hatay");
        cityListOfTR.add("antalya");


        List<String> cityListOfA = new LinkedList<>();
        cityListOfA.add("a");
        cityListOfA.add("b");
        cityListOfA.add("c");
        cityListOfA.add("d");
        cityListOfA.add("e");

        countryCityMap.put("tr", cityListOfTR);
        countryCityMap.put("a", cityListOfA);

        List<String> cityListOfB = new ArrayList<>();
        cityListOfB.add("a");
        cityListOfB.add("b");
        cityListOfB.add("c");
        cityListOfB.add("d");
        cityListOfB.add("e");
        countryCityMap.put("b", cityListOfB);

        System.out.println();

    }
}
