import java.util.concurrent.*;

public class TestThreadPool implements Runnable {
    static int a = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executor.execute(new TestThreadPool());
        }
        executor.shutdown();
    }

    public void run() {
        System.out.println(++a);
    }
}