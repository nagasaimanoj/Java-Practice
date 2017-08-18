class MyThread extends Thread {
  public void run() {
    System.out.println("thread is running...");
  }

  public static void main(String[] args) {
    new MyThread().start();
  }
}