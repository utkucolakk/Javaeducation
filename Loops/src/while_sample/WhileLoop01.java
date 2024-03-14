package while_sample;

public class WhileLoop01 {
    public static void main(String[] args) {
        int start = 0, finish = 5;

        while(finish >= start) {
            System.out.println("Start değişkenimiz : " + start + "     Finish değişkenimiz : " + finish);
            start++;
            finish--;
        }
    }
}

