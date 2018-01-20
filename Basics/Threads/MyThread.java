class MyThread extends Thread {
    public static void main(String[] args) {
        new MyThread().start();
    }

    public void run() {
        System.out.println("thread is running...");
    }
}