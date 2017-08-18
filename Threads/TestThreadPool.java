public class TestThreadPool implements Runnable {
    static int a = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            java.util.concurrent.Executors.newFixedThreadPool(2).execute(new TestThreadPool());
        }
    }

    public void run() {
        System.out.println(++a);
    }
}