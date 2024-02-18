import java.util.Random;

public class BasicOperations {

    public static void main(String[] args) {
        int[] grades = new int[20];

        //grades [0] = 5;

        // int[] grades = {66, 54, 64};

        Random random = new Random();
        for (int i=0; i<20; i++) {
            grades[i] = random.nextInt(101); // 0-100
        }
    }

    public void gradingStudents(int grades[]) {

        for (int grade : grades) {



        }
    }
}
