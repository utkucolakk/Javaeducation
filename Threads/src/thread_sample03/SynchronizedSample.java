package thread_sample03;

public class SynchronizedSample {
    private int count = 0;
    public synchronized void increment() {
        System.out.println(count);
        count++;
    }


    public static void main(String[] args) {
        SynchronizedSample synchronizedSample = new SynchronizedSample();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                synchronizedSample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                synchronizedSample.increment();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("sonuç : " + synchronizedSample.count);
    }
}
