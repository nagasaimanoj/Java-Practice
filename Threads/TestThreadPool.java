import java.util.concurrent.*;

public class TestThreadPool implements Runnable {
    static int a = 0;
    int j[] = { 9, 5, 3, 2, 8, 4, 0, 7, 6, 1 };

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executor.execute(new TestThreadPool());
        }
        executor.shutdown();
    }

    public void run() {
        System.out.println(j[a++]);
    }
}