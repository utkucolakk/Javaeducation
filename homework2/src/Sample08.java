public class Sample08 {
    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;

        for(int number = 1; number <= 500; number++)
        {
            int temp = number;
            number1 = temp % 10;

            temp = temp / 10;
            number2 = temp % 10;

            temp = temp / 10;
            number3 = temp % 10;

            if(number1*number1*number1 + number2*number2*number2 + number3*number3*number3 == number)
            {
                System.out.println(number);
            }
        }

    }
}
