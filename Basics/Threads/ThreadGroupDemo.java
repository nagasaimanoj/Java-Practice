public class ThreadGroupDemo implements Runnable {
    public static void main(String[] args) {

        ThreadGroup tg1 = new ThreadGroup("Thread Group");

        new Thread(tg1, new RunThis()).start();
        new Thread(tg1, new RunThis()).start();
        new Thread(tg1, new RunThis()).start();

        tg1.list();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class RunThis extends Thread {
    static int i = 0;
    int j;

    RunThis() {
        j = ++i;
    }

    synchronized public void run() {
        System.out.println("thread : " + j);
    }
}