public class ThreadGroupDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadGroup tg1 = new ThreadGroup("Thread Group");

        Thread t1 = new Thread(tg1, new RunThis());
        t1.start();
        Thread t2 = new Thread(tg1, new RunThis());
        t2.start();
        Thread t3 = new Thread(tg1, new RunThis());
        t3.start();

        tg1.list();
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