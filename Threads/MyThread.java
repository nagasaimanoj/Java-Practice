class MyThread extends Thread {
<<<<<<< HEAD
=======
    public static void main(String[] args) {
        new MyThread().start();
    }

    public void run() {
        System.out.println("thread is running...");
    }
}
/*public class MyThread implements Runnable {
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
  public void run() {
    System.out.println("thread is running...");
  }

  public static void main(String[] args) {
    new MyThread().start();
  }
}