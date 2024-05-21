package thread_homework01;

class StudentTask implements Runnable {
    private final int studentId;

    public StudentTask(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void run() {
        // Bu bölümde öğrencinin notlarını hesaplayabilirsiniz
        // ve not ortalamasını bulabilirsiniz.
        System.out.println("Student " + studentId + ": Grading and calculating average...");

        // Öğrenci notları burada hesaplanır ve ortalama bulunur.
        double[] grades = generateRandomGrades();
        double averageGrade = calculateAverage(grades);

        System.out.println("Student " + studentId + ": Grades: " + gradesToString(grades));
        System.out.println("Student " + studentId + ": Average Grade: " + averageGrade);
    }

    private double[] generateRandomGrades() {
        double[] grades = new double[5];
        for (int i = 0; i < 5; i++) {
            grades[i] = Math.random() * 100; // Rastgele notlar üret
        }
        return grades;
    }

    private double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private String gradesToString(double[] grades) {
        StringBuilder sb = new StringBuilder();
        for (double grade : grades) {
            sb.append(grade).append(" ");
        }
        return sb.toString();
    }
}