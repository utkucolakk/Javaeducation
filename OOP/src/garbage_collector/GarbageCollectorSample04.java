package garbage_collector;

import java.util.Date;

public class GarbageCollectorSample04 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory : " + runtime.totalMemory());
        System.out.println("Free Memory : " + runtime.freeMemory());

        Date d = null;
        for (int i=0; i<1000000000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After free memory : " + runtime.freeMemory());
        System.gc();

        System.out.println("After GC free memory : " + runtime.freeMemory());
    }
}
