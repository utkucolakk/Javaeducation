package list_sample.arraylist_sample01;

import java.util.ArrayList;

public class ArrayListSample02 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("zeynep");
        nameList.add("cemre");
        nameList.add("melisa");
        nameList.add("hilal");
        nameList.add("şevval");
        nameList.add("esra");
        System.out.println(nameList.size());
        System.out.println("List: " + nameList);

        System.out.println("contains: " + nameList.contains("hila"));
        System.out.println("contains: " + nameList.contains("hilal"));
        for (String name: nameList) {
            System.out.println(name);
        }

        nameList.remove("zeynep");
        nameList.remove(1);
        System.out.println("----after remove----");
        for (String name: nameList) {
            System.out.println(name);
        }

        System.out.println(nameList.isEmpty());
        System.out.println(nameList.size());

        Object[] nameArray = nameList.toArray();
        String name = (String) nameArray[0];
        nameList.clear();
        //nameList.removeAll(nameList);
        System.out.println("----after removeAll----");
        System.out.println(nameList.isEmpty());
        System.out.println(nameList.size());
    }

}
