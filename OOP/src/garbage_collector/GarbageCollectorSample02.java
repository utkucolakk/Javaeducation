package garbage_collector;

public class GarbageCollectorSample02 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1 = e2;
    }
}
