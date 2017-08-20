public class DaemonThread extends Thread {

<<<<<<< HEAD
   public void run(){
	  if(Thread.currentThread().isDaemon()){ 
	      System.out.println("Daemon thread executing");  
	  }  
	  else{  
	      	System.out.println("user(normal) thread executing");  
          }  
   }  
	public static void main(String[] args){  
		DaemonThread t1 = new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		new DaemonThread().start();
   } 
=======
    public static void main(String[] args) {
     /* Creating two threads: by default they are
	  * user threads (non-daemon threads)
	  */
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();

        //Making user thread t1 to Daemon
        t1.setDaemon(true);

        //starting both the threads

        t2.start();
        t1.start();

    }

    public void run() {

        // Checking whether the thread is Daemon or not
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread executing");
        } else {
            System.out.println("user(normal) thread executing");
        }
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}