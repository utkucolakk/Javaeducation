package list_sample.arraylist_sample01;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSample03 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(1);
        numberList.add(15);
        numberList.add(8);
        numberList.add(6);

        System.out.println(numberList);

        System.out.println("----naturalOrder sorting----");
        numberList.sort(Comparator.naturalOrder());
        System.out.println(numberList);

        System.out.println("---- reverseOrder sorting----");
        numberList.sort(Comparator.reverseOrder());
        System.out.println(numberList);




        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Gülfem");
        nameList.add("Merve");
        nameList.add("Mina");
        nameList.add("Dilara");

        System.out.println("----naturalOrder sorting----");
        nameList.sort(Comparator.naturalOrder());
        System.out.println(nameList);

        System.out.println("----reverseOrder sorting----");
        nameList.sort(Comparator.reverseOrder());
        System.out.println(nameList);
        System.out.println(nameList.indexOf("Mina"));
        System.out.println(nameList.indexOf("Dilara"));
        System.out.println(nameList.indexOf("sad"));
    }
}
