package thread_homework01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExamGradingSystem {

    public static void main(String[] args) {
        int numberOfStudents = 100;
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int studentId = 1; studentId <= numberOfStudents; studentId++) {
            Runnable studentTask = new StudentTask(studentId);
            executor.execute(studentTask);
        }

        executor.shutdown();
    }
}

