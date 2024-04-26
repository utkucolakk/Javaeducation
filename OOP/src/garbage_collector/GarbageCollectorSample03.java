package garbage_collector;

public class GarbageCollectorSample03 {

    public static void main(String[] args) {
        new Employee(); // Hiçbir atama olmadığı için garbage collector tarafından silinecek.
    }
}
