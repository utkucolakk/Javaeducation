public class ArraySample02 {
    public static void main(String[] args) {
        //kapalı hali
        int [] numbers = {1,2,5,3,6}; //new int


        //açık hali
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 5;
        numbers [3] = 3;
        numbers [4] = 6;



        System.out.println("numbers 3. index değeri : " + numbers[0]);
        System.out.println("numbers 3. index değeri : " + numbers[1]);
        System.out.println("numbers 3. index değeri : " + numbers[2]);
        System.out.println("numbers 3. index değeri : " + numbers[3]);
        System.out.println("numbers 3. index değeri : " + numbers[4]);

        for (int i=0; i<numbers.length; i++) {
            System.out.println("loop i : " + i + " değeri : " + numbers[i]);
        }

        System.out.println("foreach ile yazımı");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
