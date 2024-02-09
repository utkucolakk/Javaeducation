import java.util.Scanner;

public class Sample09
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0,
                secondTerm = 1,
                thirdTerm;

        System.out.print("Terim sayısı girin : ");
        number = console.nextInt();

        System.out.print(firstTerm + " " + secondTerm + " ");

        for(int i = 3; i <= number; i++)
        {
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}