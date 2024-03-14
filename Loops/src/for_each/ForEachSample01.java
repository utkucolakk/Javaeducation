package for_each;

public class ForEachSample01 {
    public static void main(String[] args) {
        /*for(veritipi degiskenadi : array/list/) {

       }*/
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int number : array) {
            System.out.println("değer : " + number);
        }
    }
}